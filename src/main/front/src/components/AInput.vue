<template>
    <q-field class="a-input q-my-md"
             :error="hasError"
             :error-label="_error"
             :icon="icon"
             :helper="_helper">
        <q-input :type="type"
                 :value="innerValue"
                 :float-label="_label"
                 :stack-label="stackLabel"
                 :decimals="decimals"
                 :max-length="maxLength"
                 :clearable="clearable"
                 :color="color"
                 :inverted="inverted"
                 :prefix="prefix"
                 :suffix="suffix"
                 :readonly="readonly"
                 :disable="disabled"
                 :placeholder="placeholder"
                 :rows="rows"
                 @input="updateValue"></q-input>
    </q-field>
</template>
<style lang="stylus">
</style>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';
    import {Prop} from 'vue-property-decorator';
    import InputMixin from '../mixins/InputMixin.vue';

    @Component({
        name: 'a-input',
        mixins: [InputMixin]
    })
    export default class AInput extends Vue {
        @Prop({'default': 'text'}) type: string;
        @Prop() placeholder: string;
        @Prop() decimals: number;
        @Prop() maxLength: string;
        @Prop() color: string;
        @Prop() prefix: string;
        @Prop() suffix: string;
        @Prop() stackLabel: string;
        @Prop() inverted: boolean;
        @Prop() clearable: boolean;
        @Prop() readonly: boolean;
        @Prop() disabled: boolean;
        @Prop() icon: string;
        @Prop() rows: number;

        loading: boolean = true;

        innerValue = null;

        // Mixin variable
        label: string;
        name: string;

    }
</script>
