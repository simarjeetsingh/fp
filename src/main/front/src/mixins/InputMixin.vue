<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';
    import {Prop, Watch} from 'vue-property-decorator';

    @Component({})
    export default class InputMixin extends Vue {
        @Prop({type: null}) value;
        @Prop() name: string;
        @Prop() label: string;
        @Prop() error: string;
        @Prop() helper: string;


        AFormInput = true;
        innerValue = null;
        innerError = '';
        valueChanged;

        mounted() {
            if (this.value) {
                this.innerValue = this.value;
            }
        }

        /* METHODS */

        clearError() {
            this.innerError = '';
        }

        @Watch('value')
        changeValue(value) {
            this.innerValue = value;
        }

        updateValue(val) {
            this.innerValue = val;
            if (typeof this.valueChanged === "function") {
                this.valueChanged(this.name, val);
            }
            this.clearError();
            this.$emit('input', val);
        }

        _focus() {
            this.$emit('focus');
        }

        /* GETTERS */

        get defaultValue() {
            return null;
        }

        get hasError() {
            return !!this._error && this._error.length > 0;
        }

        get _label() {
            return this.label ? this.label :
                this['$vnode'].data['model'] ? this['$vnode'].data['model'].expression.split('.').reverse()[0] :
                    this.name ? this.name.split('.').reverse()[0] : '';
        }

        get _error(){
            return this.error || this.innerError;
        }

        get _helper() {
            return this.helper;
        }
    }
</script>
