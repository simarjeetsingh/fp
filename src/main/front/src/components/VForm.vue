<template>
    <form @submit.prevent="_submit" class="a-form">
        <slot/>
        <q-inner-loading :visible="loading">
            <q-spinner size="6rem" color="primary"></q-spinner>
        </q-inner-loading>
    </form>
</template>
<style lang="stylus">
    .a-form {
        position: relative;

        .q-inner-loading {
            background-color: rgba($body-background, 0.4);
            cursor: wait;
        }
    }
</style>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';
    import {Prop, Watch} from 'vue-property-decorator';

    import {ApiError} from '../definitions/dtos';

    @Component({
        name: 'v-form',
    })
    export default class VForm extends Vue {
        @Prop() load: () => any;
        @Prop() submit: () => any;
        @Prop() value: any;
        @Prop() goOnSuccess: string;
        @Prop({'default': 'success'}) successMsg: string;
        @Prop() silent: boolean;


        @Watch('value', {immediate: true, deep: true})
        valueWatch(val) {
            this.model = val;
            this.inputComponents.forEach(input => input.changeValue(this.getValue(input.name, input.defaultValue)));
        }

        AForm = true;
        inputComponents = [];
        submitComponents: Array<any> = [];
        model: any;
        promiseFailed: (error: any, defaultMsg?: string, silent?: boolean) => ApiError;  // AApiErrorMixin placeholder

        submitting: boolean = false;

        updated(): void {
            this.init();
        }

        mounted() {
            this.init();
        }

        init() {
            if (this.value) {
                this.inputComponents = [];
                this.submitComponents = [];

                this.scanForInputs(this.$children);
                this.injectValueChanger();
                this.valueWatch(this.value || {});
                this._set();
            }
        }

        /**
         * Scans all inner AInputs and adds them to the internal input list
         */
        scanForInputs(children): void {
            if (children && children.length > 0) {
                children.forEach(component => {
                    if (component.AFormInput && component.changeValue && component.notifyError && component.clearError && component.name) {
                        this.inputComponents.push(component);
                    } else if (component.isSubmitComponent) {
                        this.submitComponents.push(component);
                    }

                    if (!component.AForm) {
                        this.scanForInputs(component.$children);
                    }
                });
            }
        }

        injectValueChanger(): void {
            this.inputComponents.forEach(input => input.valueChanged = this.valueChanged);
        }

        notifyErrors(errors): void {
            this.inputComponents.forEach(input => input.notifyError(errors));
        }

        clearErrors(): void {
            this.inputComponents.forEach(input => input.clearError())
        }

        afterLoad(): void {
            this._set();
        }

        _set(): void {
            this.$emit('input', this.model);
        }

        _load(): any {
            return this.load ? this.load() : null;
        }

        _submit(): void {
            if (this.submitting) {
                // Prevent multiple form submissions before first one is finished
                return;
            }

            let dfd = this.submit();

            if (dfd && dfd !== null) {
                this.toggleSubmitting(true);


                dfd.done((response) => {
                    this.clearErrors();

                    this.notify({
                        message: this.successMsg,
                        type: 'positive',
                        icon: 'save'
                    });
                    this.model = appDef.apiConfig.apiCallSuccessHandler(response);
                    this._set();

                    if (this.goOnSuccess) {
                        this.$router.push(this.goOnSuccess);
                    }
                })
                    .fail((error) => {
                        this.clearErrors();

                        let apiError: ApiError = this.promiseFailed(error, 'submitError', this.silent);

                        if (apiError.errors) {
                            this.notifyErrors(apiError.errors);
                        }
                    }).always(() => this.toggleSubmitting(false));
            }
        }

        notify(notification: any): void {
            if (!this.silent) {
                this.Quasar.notify(notification);
            }
        }

        valueChanged(name: string, value: any): void {
            this.setValue(name, value);
            this._set();
        }

        getValue(path: string, defaultValue: any): any {
            let object: any = this.model;
            const keys: Array<string> = path.replace(/\[(\w+)\]/g, '.$1').replace(/^\./, '').split('.');
            while (keys.length) {
                let key: string = keys.shift();
                if (!object.hasOwnProperty(key)) {
                    this.$set(object, key, keys.length > 0 ? {} : defaultValue);
                }
                object = object[key];
            }
            return object;
        }

        setValue(path: string, value: any): void {
            let object = this.model;
            let keys = path.split('.');
            for (let i = 0; i < keys.length - 1; i++) {
                object = object[keys[i]];
            }
            object[keys[keys.length - 1]] = value;
        }

        toggleSubmitting(isSubmitting: boolean): void {
            this.submitting = isSubmitting;
            this.submitComponents.forEach(submit => submit.toggleLoading(isSubmitting));
        }

    }
</script>