<template>
    <div class="hero-image">
        <section id="columns" class="home-columns">
            <div class="row" align="center">
                <div class="col-md-4 col-sm-6 col-xs-12 columns">
                    <div class="column animate-plus animated fadeIn"  style="">
                        <i class="fa fa-cog column-icon"></i>
                        <h4>Formación Profesional Básica</h4>
                        <p>Con el Título de F.P.Básica, adquirirás un conjunto de conocimientos, destrezas y
                            habilidades, que te permitirán desempeñar, un puesto de trabajo como Técnico
                            Informático.</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 col-xs-12 columns">
                    <div class="column animate-plus animated fadeIn" style="animation-delay: 0.2s;">
                        <i class="fa fa-cogs column-icon"></i>
                        <h4>Formación Profesional de Grado Medio</h4>
                        <p>El Título de Grado Medio en Sistemas Microinformáticos y Redes, te mostrará un número
                            de caminos ilimitado para que elijas que quieres ser y hasta donde quieres
                            llegar.</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 col-xs-12 columns">
                    <div class="column animate-plus animated fadeIn"  style="animation-delay: 0.4s;">
                        <i class="fa fa-cloud column-icon"></i>
                        <h4>Formación Profesional de Grado Superior</h4>
                        <p>
                            El objetivo es que puedas conseguir todas aquellas aptitudes que te permitan asumir
                            responsabilidades de coordinación, programar y planificar el trabajo de las personas.
                        </p>
                    </div>
                </div>
            </div>
        </section>

    </div>
</template>
<style>
</style>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';

    @Component({name: 'ciclos'})
    export default class Ciclos extends Vue {
        mounted() {
            document.documentElement.scrollTop = 0;
        }

    }
</script>
