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
                    <q-breadcrumbs-el label="Empresas"/>
                </q-breadcrumbs>
                <div class="row">
                    <div class="col-md-8 col-xs-12">
                        <h3 class="text-center">Formación en el centro de trabajo</h3>
                        <hr>
                        <p>El módulo profesional de Formación en Centros de Trabajo (FCT) es un bloque de formación
                            específica cuyos contenidos están organizados alrededor de actividades productivas propias
                            del perfil profesional.</p>
                            <br>
                    </div>
                    <div class="col-md-4">
                        <img class="img-responsive img-circle slideanim q-mt-lg"
                             src="../img/ASIRjpg.jpg" height="210" width="320"
                             alt="Picture of me" align="right">
                    </div>
                </div>
                <div itemprop="articleBody" style="font-family: Roboto, sans-serif">
                    <div class="entry-content">
                        <p>La característica más relevante de esta formación es que se desarrolla en un ámbito productivo real (la empresa), donde los alumnos podrán observar y desempeñar las actividades y funciones propias de los distintos puestos de trabajo de una profesión, conocer la organización de los procesos productivos o de servicios y de las relaciones laborales, siempre orientados y asesorados por los tutores del centro educativo y los instructores del centro de trabajo.</span>
                        </p>
                        <p><strong>Los objetivos de la FCT son:</strong>
                        </p>
                        <ul>
                            <li>Complementar la cualificación ya adquirida por los alumnos en el centro educativo mediante el conocimiento de los procesos productivos reales.
                            </li>
                            <li>Conocer e incorporarse a una organización empresarial, en la que los alumnos realizan actividades formativo-productivas propias de su perfil profesional.
                            </li>
                            <li>Evaluar la competencia profesional de los alumnos en situación real de trabajo, con participación empresarial. De este modo se favorece la inserción laboral de los titulados.
                            </li>
                        </ul>
                        <p><strong>Colaboración Centro Educativo – Empresa.</strong>
                        </p>
                        <p>La realización de la FCT requiere la colaboración entre los centros educativos y las empresas. Para ello es necesaria la firma de un concierto de colaboración entre ambas instituciones en el que se comprometen a:
                        </p>
                        <ul>
                            <li>Designar un Instructor de la empresa y un tutor del centro educativo, para el seguimiento y evaluación del alumno.
                            </li>
                            <li>Acordar el programa formativo que contemple las actividades a realizar por el alumno en la empresa y los resultados de aprendizaje esperados, sobre la base del contenido curricular que marque la legislación educativa vigente.
                            </li>
                        </ul>
                        <p><strong>Las características más singulares de este concierto de colaboración son las siguientes:</strong>
                        </p>
                        <ul>
                            <li>No implica, en ningún caso, vinculación o relación laboral de los alumnos con la empresa.
                            </li>
                            <li>Los alumnos no reciben compensación económica alguna por sus actividades mientras dure la FCT.
                            </li>
                            <li>El seguro escolar, además de un seguro de responsabilidad civil y de accidentes concertado a este fin por las administraciones educativas, cubre las posibles contingencias de los alumnos en la empresa.
                            </li>
                            <li>Se podrá rescindir el concierto o suspender su vigencia a petición de cualquiera de las partes.
                            </li>
                        </ul>
                        <p><strong>Realización y seguimiento.</strong>
                        </p>
                        <ul>
                            <li>El alumno desarrollará las actividades del programa formativo siguiendo un horario y un calendario acordados con la empresa.
                            </li>
                            <li>Los períodos de realización de la FCT serán aquellos prefijados por las administraciones educativas (en general de septiembre a diciembre, o de abril a junio, en función de la duración total del ciclo).
                            </li>
                            <li>El profesor-tutor educativo desarrollará una jornada quincenal en el centro educativo con los alumnos, así como visitas y contactos periódicos con la empresa.
                            </li>
                            <li>El instructor de la empresa será el coordinador de las actividades del alumno en la empresa, aportando aquellas orientaciones que contribuyan al proceso formativo del alumno.
                            </li>
                        </ul>
                    </div>
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

