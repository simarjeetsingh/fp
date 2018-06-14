<template>
    <div>
        <router-view />
    </div>
</template>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';
 
    @Component({name: 'a-parent'})
    export default class AParent extends Vue {
    }
</script>