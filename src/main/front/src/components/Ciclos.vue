<template>
    <div class="hero-image">
        <img  class="responsiv" src="../img/1501563989.jpg">
        <div class="hero-text">
            <h1 style="font-size:50px"></h1>
        </div>
    </div>
</template>
<style>
    .responsiv {
        width: 100%;
        /*max-width: 200px;*/
        height: 500px;
        opacity: 0.7;

    }

    .hero-text {
        text-align: center;
        position: absolute;
        top: 45%;
        left: 50%;
        transform: translate(-50%, -50%);
        color: #699e4f;
    }

</style>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';

    @Component({name: 'ciclos'})
    export default class Ciclos extends Vue {

    }
</script>
