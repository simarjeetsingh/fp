<template>
    <div class="container">
        <div class="row">
            <div class="col-sm-1"></div>
            <div class="col-sm-10 que-fp"
                 style="font-family: 'Open Sans'; font-size: 14pt; line-height: 1.5; text-align: justify; ">
                <q-breadcrumbs
                        separator="/"
                        active-color="primary"
                        class="q-my-md"
                >
                    <q-breadcrumbs-el label="Inicio" to="/"/>
                    <q-breadcrumbs-el label="¿Qué es la FP?"/>
                </q-breadcrumbs>
                <div class="row">
                    <div class="col-md-8 col-xs-12">
                        <h3 class="text-center">¿Qué es la FP?</h3>
                        <hr>
                        <p>La Formación Profesional (FP) es aquella enseñanza que engloba diferentes estudios o
                            aprendizajes que están encaminados a la inserción laboral.
                            Es un sistema formativo igualmente válido que la educación universitaria, caracterizado
                            por su vertiente práctica y cercanía a las empresas. Se trata de aprender haciendo.</p>
                        <br>
                    </div>
                    <div class="col-md-4">
                        <img class="img-responsive img-circle slideanim q-mt-lg"
                             src="../img/thinking.jpg" height="230" width="340"
                             alt="Picture of me" align="right">
                    </div>
                </div>
                <div itemprop="articleBody">
                    <p>Además, la <b>Formación Profesional </b>cuenta con otros aspectos muy positivos:</p>
                    <p>- La duración de estos estudios es más breve que los universitarios, por lo que la <b>incorporación
                        laboral</b> se puede realizar con mayor rapidez.</p>
                    <p>- La relación con el <b>profesorado</b> es muy especial, siendo un trabajo en equipo desde el
                        primer
                        momento: más que un profesor, será como aprender con un compañero con más experiencia.</p>
                    <p>- Las tasas de <b>matriculación</b> son más asequibles que las de la universidad.</p>
                    <p>- También podrás realizar <b>prácticas</b> en el extranjero y la convalidación de títulos en
                        Europa es prácticamente automática.</p>
                </div>
                <!--<q-item-separator class="q-mt-lg"/>-->
                <div class="container-fluid motivo q-mt-lg">
                    <h4 class="text-center">Contacto</h4>
                    <hr>
                    <div class="">
                        <q-input class="q-my-md q-ml-lg" float-label="Nombre"/>
                        <q-input class="q-my-md q-ml-lg" float-label="Email" type="email"/>
                        <q-input float-label="Mensaje" class="q-my-md q-ml-lg" type="textarea" rows="2"/>
                        <q-btn size="md" label="enviar" class="q-mt-sm q-ml-lg" color="primary" style="width: 10%"/>
                    </div>
                </div>
            </div>

        </div>
    </div>
</template>
<style>
    .que-fp h3 {
        margin: 20px 0 25px 0;
    }
</style>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';

    @Component({name: 'ciclos'})
    export default class Fp extends Vue {
        mounted() {
            document.documentElement.scrollTop = 0;
        }
    }
</script>
