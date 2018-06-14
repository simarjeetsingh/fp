<template>
  <div>
  <router-view />
</div>
</template>

<script>
    import Vue from 'vue';
    import Component from 'vue-class-component';

    @Component({
        name: 'App'
    })
    export default class extends Vue {
    }
</script>
