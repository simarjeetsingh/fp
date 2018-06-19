<template>
    <div>
        <div>
            <img class="responsiv" src="../img/fedadc37fd82ab92a774ad2949933e14.jpg">
            <div class="hero-text">
                <h1 style="font-size:50px">Fórmate en el sector con más demanada laboral</h1>
            </div>
        </div>

        <div class="content-container">
            <div class="row" align="center">
                <div class="col-md-4 col-sm-6 col-xs-12 columns">
                    <div class="column animate-plus animated fadeIn" style="display: block;">
                        <i class="fa fa-cog column-icon"></i>
                        <h4>Formación Profesional Básica</h4>
                        <p>Con el Título de F.P.Básica, adquirirás un conjunto de conocimientos, destrezas y
                            habilidades, que te permitirán desempeñar, un puesto de trabajo como Técnico
                            Informático.</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 col-xs-12 columns">
                    <div class="column animate-plus animated fadeIn" style="animation-delay: 0.2s; display: block;">
                        <i class="fa fa-cogs column-icon"></i>
                        <h4>Formación Profesional de Grado Medio</h4>
                        <p>El Título de Grado Medio en Sistemas Microinformáticos y Redes, te mostrará un número
                            de caminos ilimitado para que elijas que quieres ser y hasta donde quieres
                            llegar.</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-6 col-xs-12 columns">
                    <div class="column animate-plus animated fadeIn" style="animation-delay: 0.4s; display: block;">
                        <i class="fa fa-cloud column-icon"></i>
                        <h4>Formación Profesional de Grado Superior</h4>
                        <p>
                            El objetivo es que puedas conseguir todas aquellas aptitudes que te permitan asumir
                            responsabilidades de coordinación, programar y planificar el trabajo de las personas.
                        </p>
                    </div>
                </div>
            </div>
            <div class="container-fluid  text-center"
                 style="margin-right: 0; padding-right: 0;" id="ciclos">
                <!--<hr>-->
                <h4 class="text-center animate-fade">Ciclos formativos</h4>
                <hr>
                <div class="row" align="center">
                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <a @click="$router.replace('/ciclos')">
                            <div class="hovereffect">
                                <img class="img-responsive portfolioImg"
                                     src="../img/fpbofi.jpg">
                                <div class="overlay">
                                    <h2>FP básico</h2>
                                    <p>Informática de Oficina</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <a @click="$router.replace('/ciclos')">
                            <div class="hovereffect">
                                <img class="img-responsive portfolioImg"
                                     src="../img/fpbasica.jpg">
                                <div class="overlay">
                                    <h2>FP básico</h2>
                                    <p>Informática y comunicaciones</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <a @click="$router.replace('/ciclos')">
                            <div class="hovereffect">
                                <img class="img-responsive portfolioImg"
                                     src="../img/smr.jpg">
                                <div class="overlay">
                                    <h2>FP grado medio</h2>
                                    <p>Sistemas Microinformáticos y Redes</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <a @click="$router.replace('/ciclos')">
                            <div class="hovereffect">
                                <img class="img-responsive portfolioImg"
                                     src="../img/DAW.jpg">
                                <div class="overlay">
                                    <h2>FP grado superior</h2>
                                    <p>Desarrollo de Aplicaciones Web</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <a @click="$router.replace('/ciclos')">
                            <div class="hovereffect">
                                <img class="img-responsive portfolioImg"
                                     src="../img/DAM.jpg">
                                <div class="overlay">
                                    <h2>FP grado superior</h2>
                                    <p>Desarrollo de Aplicaciones Multiplataforma</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12">
                        <a @click="$router.replace('/ciclos')">
                            <div class="hovereffect">
                                <img class="img-responsive portfolioImg"
                                     src="../img/ASIRjpg.jpg">
                                <div class="overlay">
                                    <h2>FP grado superior</h2>
                                    <p>Administración de Sistemas Informáticos en Red</p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-md-8 col-xs-12 motivo q-mt-lg" style="font-family: Roboto, sans-serif">
                    <h4 class="text-center">Motivos por los que estudiar un FP de informática</h4>
                    <hr>
                    <p class="q-mt-lg" style="font-family: Roboto, sans-serif">Si estás pensando en estudiar un FP que
                        aumente tu empleabilidad y tenga futuro no dejes de  informarte sobre los FP de grado superior en informática: múltiples especializaciones para que
                        estudies lo que más te guste.</p>
                    <p>El campo de la informática es uno de los que mayor crecimiento ha experimentado en estos últimos
                        años y todo parece indicar que la tendencia seguirá en aumento. Por eso posiblemente sea uno de
                        los mejores segmentos donde especializarse con un ciclo formativo de grado superior ya que la
                        demanda de profesionales especializados en distintas ramas relacionadas con la informática
                        seguirá siendo importante.</p>
                </div>
                <div class="col-md-4 q-mt-lg" style="margin-top: 70px">
                    <img class="img-responsive img-circle slideanim q-mt-lg"
                         src="../img/58.jpg" height="230" width="340"
                         alt="Picture of me" align="right">
                </div>
            </div>

            <div class="container-fluid motivo q-mt-lg">
                <h4 class="text-center">Contacto</h4>
                <hr>
                <div class="">
                    <q-input class="q-my-md q-ml-lg" float-label="Nombre"/>
                    <q-input class="q-my-md q-ml-lg" float-label="Email" type="email"/>
                    <q-input float-label="Mensaje" class="q-my-md q-ml-lg" type="textarea" rows="4"/>
                    <q-btn size="md" label="enviar" class="q-mt-sm q-ml-lg" color="primary" style="width: 10%"/>
                </div>
            </div>

        </div>
    </div>
</template>
<style>
    .motivo h4 {
        margin: 50px 0 25px 0;
    }

    .content-container {
        max-width: 1140px;
        margin-left: 105px;
    }

    .responsiv {
        width: 100%;
        /*max-width: 200px;*/
        height: 490px;
        opacity: 0.7;
        margin-bottom: 10px;
    }

    .hero-text {
        text-align: center;
        position: absolute;
        top: 280px;
        left: 50%;
        transform: translate(-50%, -50%);
        color: #699e4f;
    }

    .hovereffect:hover img {
        opacity: 0.4;
        filter: alpha(opacity=40);
        -webkit-transform: translate3d(0, 0, 0);
        transform: translate3d(0, 0, 0);
    }

    .hovereffect a, .hovereffect p {
        color: #FFF;
        opacity: 0;
        filter: alpha(opacity=0);
        -webkit-transition: opacity 0.35s, -webkit-transform 0.35s;
        transition: opacity 0.35s, transform 0.35s;
        -webkit-transform: translate3d(100%, 0, 0);
        transform: translate3d(100%, 0, 0);
    }

    .hovereffect:hover a, .hovereffect:hover p, .hovereffect:hover h2 {
        opacity: 1;
        filter: alpha(opacity=100);
        -webkit-transform: translate3d(0, 0, 0);
        transform: translate3d(0, 0, 0);
    }

</style>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';
    import * as $ from 'jquery';

    @Component({name: 'index'})
    export default class Index extends Vue {

        mounted() {
            document.documentElement.scrollTop = 0;
        }
    }
</script>
