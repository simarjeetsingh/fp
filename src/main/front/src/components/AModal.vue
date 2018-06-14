<template>
    <q-modal ref="modal"
             :value="value"
             @input="onInput"
             @hide="onHide"
             @show="onShow"
             :minimized="minimized"
             :maximized="maximized"
             :position="position"
             content-classes="a-modal q-pa-md">
        <slot></slot>
        <div v-if="showActions" :align="alignActions">
            <slot name="actions"/>
            <q-btn v-if="accept" color="primary" @click="accept()" label="accept" :flat="flatActions"></q-btn>
            <q-btn v-if="closable" color="secondary" @click="close()" label="cancel" :flat="flatActions"></q-btn>
        </div>
    </q-modal>
</template>
<style lang="stylus">

    .a-modal {
        border-radius: 5px;
        width: 400px;
    }

</style>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';
    import {Prop} from 'vue-property-decorator';
    import ReflectionMixin from '../mixins/ReflectionMixin'

    @Component({
        name: 'a-modal',
        mixins: [ReflectionMixin]
    })
    export default class AModal extends Vue {
        @Prop() value: boolean;
        @Prop() closable: boolean;
        @Prop() minimized: boolean;
        @Prop() maximized: boolean;
        @Prop() accept: () => void;
        @Prop() flatActions: boolean;
        @Prop({'default': 'right'}) alignActions: string;
        @Prop() position : string;

        // AReflectionMixin
        renderSlot: (string) => boolean;

        open() {
            this.$refs['modal']['show']();
        }

        close() {
            this.$refs['modal']['hide']();
        }

        toggle() {
            this.$refs['modal']['toggle']();
        }

        onInput(input) {
            this.$emit('input', input);
        }

        onHide() {
            this.$emit('close');
        }

        onShow() {
            this.$emit('open');
        }

        get showActions(): boolean {
            return this.renderSlot('actions') || this.closable || !!this.accept;
        }
    }
</script>
