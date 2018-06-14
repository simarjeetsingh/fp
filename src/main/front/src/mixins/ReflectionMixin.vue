<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';

    @Component
    export default class ReflectionMixin extends Vue {

        renderSlot(name: string): boolean {
            return !!this.$slots[name];
        }

    }
</script>
