<template>
    <div class="hero-image">
        <img class="responsiv" src="../img/man.jpg">
        <div class="hero-text">
            <h1 style="font-size:50px"></h1>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-sm-1"></div>
                <div class="col-sm-10"
                     style="font-family: 'Open Sans'; font-size: 14pt; line-height: 1.5; text-align: justify; ">
                    <h3>¿Qué es la FP?</h3>
                    <p>
                        La Formación Profesional (FP) es aquella enseñanza que engloba diferentes estudios o
                        aprendizajes que
                        están encaminados a la inserción laboral.
                        Es un sistema formativo igualmente válido que la educación universitaria, caracterizado por su
                        vertiente
                        práctica y cercanía a las empresas. Se trata de aprender haciendo.
                    </p>
                    <div itemprop="articleBody">
                        <p>Además, la <b>Formación Profesional </b>cuenta con otros aspectos muy positivos:</p>
                        <p>- La duración de estos estudios es más breve que los universitarios, por lo que la <b>incorporación
                            laboral</b> se puede realizar con mayor rapidez.</p>
                        <p>- La relación con el <b>profesorado</b> es muy especial, siendo un trabajo en equipo desde el
                            primer
                            momento: más que un profesor, será como aprender con un compañero con más experiencia.</p>
                        <p>- Las tasas de <b>matriculación</b> son más asequibles que las de la universidad.</p>
                        <p>- También podrás realizar <b>prácticas</b> en el extranjero y la convalidación de títulos en
                            Europa
                            es prácticamente automática.</p>
                    </div>
                    <q-item-separator class="q-mt-lg"/>

                </div>
            </div>
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
    export default class Fp extends Vue {

    }
</script>
