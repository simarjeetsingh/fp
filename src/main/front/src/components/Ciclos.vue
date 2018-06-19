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
                    <q-breadcrumbs-el label="Ciclos"/>
                </q-breadcrumbs>
                <div class="">
                    <section id="columns" class="home-columns">
                        <div class="row" align="center">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <q-card>
                                    <q-item class="item">
                                        <q-item-side icon="fa fa-cog column-icon"/>
                                        <q-item-main class="q-pl-md">
                                            <q-item-tile label>
                                                <h4>Formación Profesional Básica</h4>
                                            </q-item-tile>
                                        </q-item-main>
                                    </q-item>
                                    <q-collapsible indent class="q-pl-md" group="fpBasica" icon="add"
                                                   label="Título Profesional Básico en Informática de Oficina">
                                        <q-collapsible group="fpBasicaOfi" label="Duración del estudio">
                                            <q-card>
                                                <q-card-main class="text-left">
                                                    2000 horas.
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Requisitos de acceso">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p>
                                                        El acceso a los ciclos de Formación Profesional
                                                        Básica requerirá el cumplimiento simultáneo de las
                                                        siguientes condiciones:
                                                    </p>
                                                    <ul style="list-style-type:disc">

                                                        <li> Tener cumplidos quince años, o cumplirlos durante
                                                            el año natural en curso, y no superar los diecisiete
                                                            años de edad en el momento del acceso o durante el
                                                            año natural en curso
                                                        </li>
                                                        <li>
                                                            Haber cursado el primer ciclo de Educación Secundaria
                                                            Obligatoria o, excepcionalmente, haber cursado el
                                                            segundo curso de la Educación Secundaria Obligatoria.
                                                        </li>
                                                        <li>
                                                            Haber propuesto el equipo docente a los padres, madres o
                                                            tutores legales la incorporación del alumno o alumna a
                                                            un ciclo de Formación Profesional Básica

                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Qué voy a aprender y hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <ul>
                                                        <li>Acopiar los materiales para acometer el montaje y/o
                                                            mantenimiento en sistemas microinformáticos y redes de
                                                            transmisión de datos.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de montaje de sistemas
                                                            microinformáticos y dispositivos auxiliares en
                                                            condiciones de calidad.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de mantenimiento y
                                                            reparación de sistemas microinformáticos garantizando su
                                                            funcionamiento.
                                                        </li>
                                                        <li>Realizar las operaciones para el almacenamiento y
                                                            transporte de sistemas, periféricos y consumibles,
                                                            siguiendo criterios de seguridad y catalogación.
                                                        </li>
                                                        <li>Realizar comprobaciones rutinarias de verificación en el
                                                            montaje y mantenimiento de sistemas y/o instalaciones.
                                                        </li>
                                                        <li>Montar canalizaciones para cableado de datos en
                                                            condiciones de calidad y seguridad.
                                                        </li>
                                                        <li>Tender el cableado de redes de datos aplicando las
                                                            técnicas y procedimientos normalizados.
                                                        </li>
                                                        <li>Manejar las herramientas del entorno usuario
                                                            proporcionadas por el sistema operativo y los
                                                            dispositivos de almacenamiento de información.
                                                        </li>
                                                        <li>Manejar aplicaciones ofimáticas de procesador de textos
                                                            para realizar documentos sencillos.
                                                        </li>
                                                        <li>Realizar las tareas de su responsabilidad tanto
                                                            individualmente como en equipo, con autonomía e
                                                            iniciativa, adaptándose a las situaciones producidas por
                                                            cambios tecnológicos u organizativos.
                                                        </li>
                                                        <li>Adquirir hábitos de responsabilidad y autonomía basados
                                                            en la práctica de valores, favoreciendo las relaciones
                                                            interpersonales y profesionales, trabajando en equipo y
                                                            generando un ambiente favorable de convivencia que
                                                            permita integrarse en los distintos ámbitos de la
                                                            sociedad.
                                                        </li>
                                                        <li>Desarrollar hábitos y valores acordes con la
                                                            conservación y sostenibilidad del patrimonio natural,
                                                            analizando la interacción entre las sociedades humanas y
                                                            el medio natural y valorando las consecuencias que se
                                                            derivan de la acción humana sobre el medio.
                                                        </li>
                                                        <li>Valorar las diferentes manifestaciones artísticas y
                                                            culturales de forma fundamentada utilizándolas como
                                                            fuente de enriquecimiento personal y social y
                                                            desarrollando actitudes estéticas y sensibles hacia la
                                                            diversidad cultural y el patrimonio artístico.
                                                        </li>
                                                        <li>Comunicarse en diferentes situaciones laborales o
                                                            sociales utilizando recursos lingüísticos con precisión
                                                            y claridad, teniendo en cuenta el contexto y utilizando
                                                            formas orales y escritas básicas tanto de la propia
                                                            lengua como de alguna lengua extranjera.
                                                        </li>
                                                        <li>Resolver problemas predecibles relacionados con su
                                                            entorno social y productivo utilizando los elementos
                                                            proporcionados por las ciencias aplicadas y sociales y
                                                            respetando la diversidad de opiniones como fuente de
                                                            enriquecimiento en la toma de decisiones.
                                                        </li>
                                                        <li>Ejercer de manera activa y responsable los derechos y
                                                            deberes derivados tanto de su actividad profesional como
                                                            de su condición de ciudadano
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Plan de formación">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Los módulos de este ciclo formativo son los
                                                        siguientes:</p>
                                                    <ul>
                                                        <li class="ta-justify">Montaje y mantenimiento de sistemas y
                                                            componentes informáticos.
                                                        </li>
                                                        <li class="ta-justify">Operaciones auxiliares para la
                                                            configuración y la explotación.
                                                        </li>
                                                        <li class="ta-justify">Ofimática y archivo de documentos.</li>
                                                        <li class="ta-justify">Instalación y mantenimiento de redes para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Ciencias aplicadas I.</li>
                                                        <li class="ta-justify">Ciencias aplicadas II.</li>
                                                        <li class="ta-justify">Comunicación y sociedad I.</li>
                                                        <li class="ta-justify">Comunicación y sociedad II.</li>
                                                        <li class="ta-justify">Formación en centros de trabajo.</li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Al finalizar mis estudios, ¿Qué puedo hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Trabajar como:</p>

                                                    <ul>
                                                        <li class="ta-justify">Ayudante de montador de sistemas
                                                            microinformáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de mantenimiento de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Auxiliar de oficina.</li>
                                                        <li class="ta-justify">Auxiliar de servicios generales.</li>
                                                        <li class="ta-justify">Grabador-verificador de datos.</li>
                                                        <li class="ta-justify">Auxiliar de digitalización.</li>
                                                        <li class="ta-justify">Operador documental.</li>
                                                    </ul>

                                                    <p class="ta-justify">Seguir estudiando:</p>

                                                    <ul>
                                                        <li class="ta-justify">Un ciclo formativo de grado medio (Este
                                                            título tendrá preferencia para la admisión a todos los
                                                            títulos de grado medio de las familias profesionales de
                                                            Electricidad y Electrónica, Informática y Comunicaciones,
                                                            Fabricación Mecánica, Instalación y Mantenimiento, Energía y
                                                            Agua, Industrias Extractivas, Marítimo-Pesquera, Química,
                                                            Transporte y Mantenimiento de Vehículos, Madera, Mueble y
                                                            Corcho y Edificación y Obra Civil)
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Cuáles son las salidas profesionales?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Este profesional ejerce su actividad por
                                                        cuenta ajena en empresas dedicadas a la comercialización,
                                                        montaje, mantenimiento y reparación de sistemas
                                                        microinformáticos, equipos eléctricos o electrónicos y en
                                                        empresas que utilicen sistemas informáticos, para su
                                                        gestión.</p>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                    </q-collapsible>
                                    <q-collapsible class="q-pl-md" group="fpBasica" icon="add"
                                                   label="Título Profesional Básico en Informática y Comunicaciones">
                                        <q-collapsible group="fpBasicaOfi" label="Duración del estudio">
                                            <q-card>
                                                <q-card-main class="text-left">
                                                    2000 horas.
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Requisitos de acceso">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p>
                                                        El acceso a los ciclos de Formación Profesional
                                                        Básica requerirá el cumplimiento simultáneo de las
                                                        siguientes condiciones:
                                                    </p>
                                                    <ul style="list-style-type:disc">

                                                        <li> Tener cumplidos quince años, o cumplirlos durante
                                                            el año natural en curso, y no superar los diecisiete
                                                            años de edad en el momento del acceso o durante el
                                                            año natural en curso
                                                        </li>
                                                        <li>
                                                            Haber cursado el primer ciclo de Educación Secundaria
                                                            Obligatoria o, excepcionalmente, haber cursado el
                                                            segundo curso de la Educación Secundaria Obligatoria.
                                                        </li>
                                                        <li>
                                                            Haber propuesto el equipo docente a los padres, madres o
                                                            tutores legales la incorporación del alumno o alumna a
                                                            un ciclo de Formación Profesional Básica

                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Qué voy a aprender y hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <ul>
                                                        <li>Acopiar los materiales para acometer el montaje y/o
                                                            mantenimiento en sistemas microinformáticos y redes de
                                                            transmisión de datos.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de montaje de sistemas
                                                            microinformáticos y dispositivos auxiliares en
                                                            condiciones de calidad.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de mantenimiento y
                                                            reparación de sistemas microinformáticos garantizando su
                                                            funcionamiento.
                                                        </li>
                                                        <li>Realizar las operaciones para el almacenamiento y
                                                            transporte de sistemas, periféricos y consumibles,
                                                            siguiendo criterios de seguridad y catalogación.
                                                        </li>
                                                        <li>Realizar comprobaciones rutinarias de verificación en el
                                                            montaje y mantenimiento de sistemas y/o instalaciones.
                                                        </li>
                                                        <li>Montar canalizaciones para cableado de datos en
                                                            condiciones de calidad y seguridad.
                                                        </li>
                                                        <li>Tender el cableado de redes de datos aplicando las
                                                            técnicas y procedimientos normalizados.
                                                        </li>
                                                        <li>Manejar las herramientas del entorno usuario
                                                            proporcionadas por el sistema operativo y los
                                                            dispositivos de almacenamiento de información.
                                                        </li>
                                                        <li>Manejar aplicaciones ofimáticas de procesador de textos
                                                            para realizar documentos sencillos.
                                                        </li>
                                                        <li>Realizar las tareas de su responsabilidad tanto
                                                            individualmente como en equipo, con autonomía e
                                                            iniciativa, adaptándose a las situaciones producidas por
                                                            cambios tecnológicos u organizativos.
                                                        </li>
                                                        <li>Adquirir hábitos de responsabilidad y autonomía basados
                                                            en la práctica de valores, favoreciendo las relaciones
                                                            interpersonales y profesionales, trabajando en equipo y
                                                            generando un ambiente favorable de convivencia que
                                                            permita integrarse en los distintos ámbitos de la
                                                            sociedad.
                                                        </li>
                                                        <li>Desarrollar hábitos y valores acordes con la
                                                            conservación y sostenibilidad del patrimonio natural,
                                                            analizando la interacción entre las sociedades humanas y
                                                            el medio natural y valorando las consecuencias que se
                                                            derivan de la acción humana sobre el medio.
                                                        </li>
                                                        <li>Valorar las diferentes manifestaciones artísticas y
                                                            culturales de forma fundamentada utilizándolas como
                                                            fuente de enriquecimiento personal y social y
                                                            desarrollando actitudes estéticas y sensibles hacia la
                                                            diversidad cultural y el patrimonio artístico.
                                                        </li>
                                                        <li>Comunicarse en diferentes situaciones laborales o
                                                            sociales utilizando recursos lingüísticos con precisión
                                                            y claridad, teniendo en cuenta el contexto y utilizando
                                                            formas orales y escritas básicas tanto de la propia
                                                            lengua como de alguna lengua extranjera.
                                                        </li>
                                                        <li>Resolver problemas predecibles relacionados con su
                                                            entorno social y productivo utilizando los elementos
                                                            proporcionados por las ciencias aplicadas y sociales y
                                                            respetando la diversidad de opiniones como fuente de
                                                            enriquecimiento en la toma de decisiones.
                                                        </li>
                                                        <li>Ejercer de manera activa y responsable los derechos y
                                                            deberes derivados tanto de su actividad profesional como
                                                            de su condición de ciudadano
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Plan de formación">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Los módulos de este ciclo formativo son los
                                                        siguientes:</p>
                                                    <ul>
                                                        <li class="ta-justify">Montaje y mantenimiento de sistemas y
                                                            componentes informáticos.
                                                        </li>
                                                        <li class="ta-justify">Operaciones auxiliares para la
                                                            configuración y la explotación.
                                                        </li>
                                                        <li class="ta-justify">Ofimática y archivo de documentos.</li>
                                                        <li class="ta-justify">Instalación y mantenimiento de redes para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Ciencias aplicadas I.</li>
                                                        <li class="ta-justify">Ciencias aplicadas II.</li>
                                                        <li class="ta-justify">Comunicación y sociedad I.</li>
                                                        <li class="ta-justify">Comunicación y sociedad II.</li>
                                                        <li class="ta-justify">Formación en centros de trabajo.</li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Al finalizar mis estudios, ¿Qué puedo hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Trabajar como:</p>

                                                    <ul>
                                                        <li class="ta-justify">Ayudante de montador de sistemas
                                                            microinformáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de mantenimiento de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Auxiliar de oficina.</li>
                                                        <li class="ta-justify">Auxiliar de servicios generales.</li>
                                                        <li class="ta-justify">Grabador-verificador de datos.</li>
                                                        <li class="ta-justify">Auxiliar de digitalización.</li>
                                                        <li class="ta-justify">Operador documental.</li>
                                                    </ul>

                                                    <p class="ta-justify">Seguir estudiando:</p>

                                                    <ul>
                                                        <li class="ta-justify">Un ciclo formativo de grado medio (Este
                                                            título tendrá preferencia para la admisión a todos los
                                                            títulos de grado medio de las familias profesionales de
                                                            Electricidad y Electrónica, Informática y Comunicaciones,
                                                            Fabricación Mecánica, Instalación y Mantenimiento, Energía y
                                                            Agua, Industrias Extractivas, Marítimo-Pesquera, Química,
                                                            Transporte y Mantenimiento de Vehículos, Madera, Mueble y
                                                            Corcho y Edificación y Obra Civil)
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Cuáles son las salidas profesionales?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Este profesional ejerce su actividad por
                                                        cuenta ajena en empresas dedicadas a la comercialización,
                                                        montaje, mantenimiento y reparación de sistemas
                                                        microinformáticos, equipos eléctricos o electrónicos y en
                                                        empresas que utilicen sistemas informáticos, para su
                                                        gestión.</p>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                    </q-collapsible>

                                </q-card>

                                <q-card class="q-my-lg animate-plus animated fadeIn" style="animation-delay: 0.1s;">
                                    <q-item class="item">
                                        <q-item-side icon="fa fa-cogs column-icon"/>
                                        <q-item-main class="q-pl-sm">
                                            <q-item-tile label>
                                                <h4>Formación Profesional grado medio</h4>
                                            </q-item-tile>
                                        </q-item-main>
                                    </q-item>
                                    <q-collapsible indent class="q-pl-md" group="fpgm" icon="add"
                                                   label="Técnico en Sistemas Microinformáticos y Redes">
                                        <q-collapsible group="fpBasicaOfi" label="Duración del estudio">
                                            <q-card>
                                                <q-card-main class="text-left">
                                                    2000 horas.
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Requisitos de acceso">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p>
                                                        El acceso a los ciclos de Formación Profesional
                                                        Básica requerirá el cumplimiento simultáneo de las
                                                        siguientes condiciones:
                                                    </p>
                                                    <ul style="list-style-type:disc">

                                                        <li> Tener cumplidos quince años, o cumplirlos durante
                                                            el año natural en curso, y no superar los diecisiete
                                                            años de edad en el momento del acceso o durante el
                                                            año natural en curso
                                                        </li>
                                                        <li>
                                                            Haber cursado el primer ciclo de Educación Secundaria
                                                            Obligatoria o, excepcionalmente, haber cursado el
                                                            segundo curso de la Educación Secundaria Obligatoria.
                                                        </li>
                                                        <li>
                                                            Haber propuesto el equipo docente a los padres, madres o
                                                            tutores legales la incorporación del alumno o alumna a
                                                            un ciclo de Formación Profesional Básica

                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Qué voy a aprender y hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <ul>
                                                        <li>Acopiar los materiales para acometer el montaje y/o
                                                            mantenimiento en sistemas microinformáticos y redes de
                                                            transmisión de datos.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de montaje de sistemas
                                                            microinformáticos y dispositivos auxiliares en
                                                            condiciones de calidad.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de mantenimiento y
                                                            reparación de sistemas microinformáticos garantizando su
                                                            funcionamiento.
                                                        </li>
                                                        <li>Realizar las operaciones para el almacenamiento y
                                                            transporte de sistemas, periféricos y consumibles,
                                                            siguiendo criterios de seguridad y catalogación.
                                                        </li>
                                                        <li>Realizar comprobaciones rutinarias de verificación en el
                                                            montaje y mantenimiento de sistemas y/o instalaciones.
                                                        </li>
                                                        <li>Montar canalizaciones para cableado de datos en
                                                            condiciones de calidad y seguridad.
                                                        </li>
                                                        <li>Tender el cableado de redes de datos aplicando las
                                                            técnicas y procedimientos normalizados.
                                                        </li>
                                                        <li>Manejar las herramientas del entorno usuario
                                                            proporcionadas por el sistema operativo y los
                                                            dispositivos de almacenamiento de información.
                                                        </li>
                                                        <li>Manejar aplicaciones ofimáticas de procesador de textos
                                                            para realizar documentos sencillos.
                                                        </li>
                                                        <li>Realizar las tareas de su responsabilidad tanto
                                                            individualmente como en equipo, con autonomía e
                                                            iniciativa, adaptándose a las situaciones producidas por
                                                            cambios tecnológicos u organizativos.
                                                        </li>
                                                        <li>Adquirir hábitos de responsabilidad y autonomía basados
                                                            en la práctica de valores, favoreciendo las relaciones
                                                            interpersonales y profesionales, trabajando en equipo y
                                                            generando un ambiente favorable de convivencia que
                                                            permita integrarse en los distintos ámbitos de la
                                                            sociedad.
                                                        </li>
                                                        <li>Desarrollar hábitos y valores acordes con la
                                                            conservación y sostenibilidad del patrimonio natural,
                                                            analizando la interacción entre las sociedades humanas y
                                                            el medio natural y valorando las consecuencias que se
                                                            derivan de la acción humana sobre el medio.
                                                        </li>
                                                        <li>Valorar las diferentes manifestaciones artísticas y
                                                            culturales de forma fundamentada utilizándolas como
                                                            fuente de enriquecimiento personal y social y
                                                            desarrollando actitudes estéticas y sensibles hacia la
                                                            diversidad cultural y el patrimonio artístico.
                                                        </li>
                                                        <li>Comunicarse en diferentes situaciones laborales o
                                                            sociales utilizando recursos lingüísticos con precisión
                                                            y claridad, teniendo en cuenta el contexto y utilizando
                                                            formas orales y escritas básicas tanto de la propia
                                                            lengua como de alguna lengua extranjera.
                                                        </li>
                                                        <li>Resolver problemas predecibles relacionados con su
                                                            entorno social y productivo utilizando los elementos
                                                            proporcionados por las ciencias aplicadas y sociales y
                                                            respetando la diversidad de opiniones como fuente de
                                                            enriquecimiento en la toma de decisiones.
                                                        </li>
                                                        <li>Ejercer de manera activa y responsable los derechos y
                                                            deberes derivados tanto de su actividad profesional como
                                                            de su condición de ciudadano
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Plan de formación">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Los módulos de este ciclo formativo son los
                                                        siguientes:</p>
                                                    <ul>
                                                        <li class="ta-justify">Montaje y mantenimiento de sistemas y
                                                            componentes informáticos.
                                                        </li>
                                                        <li class="ta-justify">Operaciones auxiliares para la
                                                            configuración y la explotación.
                                                        </li>
                                                        <li class="ta-justify">Ofimática y archivo de documentos.</li>
                                                        <li class="ta-justify">Instalación y mantenimiento de redes para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Ciencias aplicadas I.</li>
                                                        <li class="ta-justify">Ciencias aplicadas II.</li>
                                                        <li class="ta-justify">Comunicación y sociedad I.</li>
                                                        <li class="ta-justify">Comunicación y sociedad II.</li>
                                                        <li class="ta-justify">Formación en centros de trabajo.</li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Al finalizar mis estudios, ¿Qué puedo hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Trabajar como:</p>

                                                    <ul>
                                                        <li class="ta-justify">Ayudante de montador de sistemas
                                                            microinformáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de mantenimiento de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Auxiliar de oficina.</li>
                                                        <li class="ta-justify">Auxiliar de servicios generales.</li>
                                                        <li class="ta-justify">Grabador-verificador de datos.</li>
                                                        <li class="ta-justify">Auxiliar de digitalización.</li>
                                                        <li class="ta-justify">Operador documental.</li>
                                                    </ul>

                                                    <p class="ta-justify">Seguir estudiando:</p>

                                                    <ul>
                                                        <li class="ta-justify">Un ciclo formativo de grado medio (Este
                                                            título tendrá preferencia para la admisión a todos los
                                                            títulos de grado medio de las familias profesionales de
                                                            Electricidad y Electrónica, Informática y Comunicaciones,
                                                            Fabricación Mecánica, Instalación y Mantenimiento, Energía y
                                                            Agua, Industrias Extractivas, Marítimo-Pesquera, Química,
                                                            Transporte y Mantenimiento de Vehículos, Madera, Mueble y
                                                            Corcho y Edificación y Obra Civil)
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Cuáles son las salidas profesionales?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Este profesional ejerce su actividad por
                                                        cuenta ajena en empresas dedicadas a la comercialización,
                                                        montaje, mantenimiento y reparación de sistemas
                                                        microinformáticos, equipos eléctricos o electrónicos y en
                                                        empresas que utilicen sistemas informáticos, para su
                                                        gestión.</p>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                    </q-collapsible>
                                </q-card>

                                <q-card class="animate-plus animated fadeIn" style="animation-delay: 0.3s;">
                                    <q-item class="item">
                                        <q-item-side icon="fa fa-cloud column-icon"/>
                                        <q-item-main class="q-pl-sm">
                                            <q-item-tile label>
                                                <h4>Formación Profesional grado superior</h4>
                                            </q-item-tile>
                                        </q-item-main>
                                    </q-item>
                                    <q-collapsible indent class="q-pl-md" group="fpgs" icon="add"
                                                   label="Técnico Superior en Administración de Sistemas Informáticos en Red">
                                        <q-collapsible group="fpBasicaOfi" label="Duración del estudio">
                                            <q-card>
                                                <q-card-main class="text-left">
                                                    2000 horas.
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Requisitos de acceso">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p>
                                                        El acceso a los ciclos de Formación Profesional
                                                        Básica requerirá el cumplimiento simultáneo de las
                                                        siguientes condiciones:
                                                    </p>
                                                    <ul style="list-style-type:disc">

                                                        <li> Tener cumplidos quince años, o cumplirlos durante
                                                            el año natural en curso, y no superar los diecisiete
                                                            años de edad en el momento del acceso o durante el
                                                            año natural en curso
                                                        </li>
                                                        <li>
                                                            Haber cursado el primer ciclo de Educación Secundaria
                                                            Obligatoria o, excepcionalmente, haber cursado el
                                                            segundo curso de la Educación Secundaria Obligatoria.
                                                        </li>
                                                        <li>
                                                            Haber propuesto el equipo docente a los padres, madres o
                                                            tutores legales la incorporación del alumno o alumna a
                                                            un ciclo de Formación Profesional Básica

                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Qué voy a aprender y hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <ul>
                                                        <li>Acopiar los materiales para acometer el montaje y/o
                                                            mantenimiento en sistemas microinformáticos y redes de
                                                            transmisión de datos.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de montaje de sistemas
                                                            microinformáticos y dispositivos auxiliares en
                                                            condiciones de calidad.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de mantenimiento y
                                                            reparación de sistemas microinformáticos garantizando su
                                                            funcionamiento.
                                                        </li>
                                                        <li>Realizar las operaciones para el almacenamiento y
                                                            transporte de sistemas, periféricos y consumibles,
                                                            siguiendo criterios de seguridad y catalogación.
                                                        </li>
                                                        <li>Realizar comprobaciones rutinarias de verificación en el
                                                            montaje y mantenimiento de sistemas y/o instalaciones.
                                                        </li>
                                                        <li>Montar canalizaciones para cableado de datos en
                                                            condiciones de calidad y seguridad.
                                                        </li>
                                                        <li>Tender el cableado de redes de datos aplicando las
                                                            técnicas y procedimientos normalizados.
                                                        </li>
                                                        <li>Manejar las herramientas del entorno usuario
                                                            proporcionadas por el sistema operativo y los
                                                            dispositivos de almacenamiento de información.
                                                        </li>
                                                        <li>Manejar aplicaciones ofimáticas de procesador de textos
                                                            para realizar documentos sencillos.
                                                        </li>
                                                        <li>Realizar las tareas de su responsabilidad tanto
                                                            individualmente como en equipo, con autonomía e
                                                            iniciativa, adaptándose a las situaciones producidas por
                                                            cambios tecnológicos u organizativos.
                                                        </li>
                                                        <li>Adquirir hábitos de responsabilidad y autonomía basados
                                                            en la práctica de valores, favoreciendo las relaciones
                                                            interpersonales y profesionales, trabajando en equipo y
                                                            generando un ambiente favorable de convivencia que
                                                            permita integrarse en los distintos ámbitos de la
                                                            sociedad.
                                                        </li>
                                                        <li>Desarrollar hábitos y valores acordes con la
                                                            conservación y sostenibilidad del patrimonio natural,
                                                            analizando la interacción entre las sociedades humanas y
                                                            el medio natural y valorando las consecuencias que se
                                                            derivan de la acción humana sobre el medio.
                                                        </li>
                                                        <li>Valorar las diferentes manifestaciones artísticas y
                                                            culturales de forma fundamentada utilizándolas como
                                                            fuente de enriquecimiento personal y social y
                                                            desarrollando actitudes estéticas y sensibles hacia la
                                                            diversidad cultural y el patrimonio artístico.
                                                        </li>
                                                        <li>Comunicarse en diferentes situaciones laborales o
                                                            sociales utilizando recursos lingüísticos con precisión
                                                            y claridad, teniendo en cuenta el contexto y utilizando
                                                            formas orales y escritas básicas tanto de la propia
                                                            lengua como de alguna lengua extranjera.
                                                        </li>
                                                        <li>Resolver problemas predecibles relacionados con su
                                                            entorno social y productivo utilizando los elementos
                                                            proporcionados por las ciencias aplicadas y sociales y
                                                            respetando la diversidad de opiniones como fuente de
                                                            enriquecimiento en la toma de decisiones.
                                                        </li>
                                                        <li>Ejercer de manera activa y responsable los derechos y
                                                            deberes derivados tanto de su actividad profesional como
                                                            de su condición de ciudadano
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Plan de formación">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Los módulos de este ciclo formativo son los
                                                        siguientes:</p>
                                                    <ul>
                                                        <li class="ta-justify">Montaje y mantenimiento de sistemas y
                                                            componentes informáticos.
                                                        </li>
                                                        <li class="ta-justify">Operaciones auxiliares para la
                                                            configuración y la explotación.
                                                        </li>
                                                        <li class="ta-justify">Ofimática y archivo de documentos.</li>
                                                        <li class="ta-justify">Instalación y mantenimiento de redes para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Ciencias aplicadas I.</li>
                                                        <li class="ta-justify">Ciencias aplicadas II.</li>
                                                        <li class="ta-justify">Comunicación y sociedad I.</li>
                                                        <li class="ta-justify">Comunicación y sociedad II.</li>
                                                        <li class="ta-justify">Formación en centros de trabajo.</li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Al finalizar mis estudios, ¿Qué puedo hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Trabajar como:</p>

                                                    <ul>
                                                        <li class="ta-justify">Ayudante de montador de sistemas
                                                            microinformáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de mantenimiento de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Auxiliar de oficina.</li>
                                                        <li class="ta-justify">Auxiliar de servicios generales.</li>
                                                        <li class="ta-justify">Grabador-verificador de datos.</li>
                                                        <li class="ta-justify">Auxiliar de digitalización.</li>
                                                        <li class="ta-justify">Operador documental.</li>
                                                    </ul>

                                                    <p class="ta-justify">Seguir estudiando:</p>

                                                    <ul>
                                                        <li class="ta-justify">Un ciclo formativo de grado medio (Este
                                                            título tendrá preferencia para la admisión a todos los
                                                            títulos de grado medio de las familias profesionales de
                                                            Electricidad y Electrónica, Informática y Comunicaciones,
                                                            Fabricación Mecánica, Instalación y Mantenimiento, Energía y
                                                            Agua, Industrias Extractivas, Marítimo-Pesquera, Química,
                                                            Transporte y Mantenimiento de Vehículos, Madera, Mueble y
                                                            Corcho y Edificación y Obra Civil)
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Cuáles son las salidas profesionales?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Este profesional ejerce su actividad por
                                                        cuenta ajena en empresas dedicadas a la comercialización,
                                                        montaje, mantenimiento y reparación de sistemas
                                                        microinformáticos, equipos eléctricos o electrónicos y en
                                                        empresas que utilicen sistemas informáticos, para su
                                                        gestión.</p>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                    </q-collapsible>
                                    <q-collapsible class="q-pl-md" group="fpgs" icon="add"
                                                   label="Técnico Superior en Desarrollo de Aplicaciones Multiplataforma">
                                        <q-collapsible group="fpBasicaOfi" label="Duración del estudio">
                                            <q-card>
                                                <q-card-main class="text-left">
                                                    2000 horas.
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Requisitos de acceso">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p>
                                                        El acceso a los ciclos de Formación Profesional
                                                        Básica requerirá el cumplimiento simultáneo de las
                                                        siguientes condiciones:
                                                    </p>
                                                    <ul style="list-style-type:disc">

                                                        <li> Tener cumplidos quince años, o cumplirlos durante
                                                            el año natural en curso, y no superar los diecisiete
                                                            años de edad en el momento del acceso o durante el
                                                            año natural en curso
                                                        </li>
                                                        <li>
                                                            Haber cursado el primer ciclo de Educación Secundaria
                                                            Obligatoria o, excepcionalmente, haber cursado el
                                                            segundo curso de la Educación Secundaria Obligatoria.
                                                        </li>
                                                        <li>
                                                            Haber propuesto el equipo docente a los padres, madres o
                                                            tutores legales la incorporación del alumno o alumna a
                                                            un ciclo de Formación Profesional Básica

                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Qué voy a aprender y hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <ul>
                                                        <li>Acopiar los materiales para acometer el montaje y/o
                                                            mantenimiento en sistemas microinformáticos y redes de
                                                            transmisión de datos.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de montaje de sistemas
                                                            microinformáticos y dispositivos auxiliares en
                                                            condiciones de calidad.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de mantenimiento y
                                                            reparación de sistemas microinformáticos garantizando su
                                                            funcionamiento.
                                                        </li>
                                                        <li>Realizar las operaciones para el almacenamiento y
                                                            transporte de sistemas, periféricos y consumibles,
                                                            siguiendo criterios de seguridad y catalogación.
                                                        </li>
                                                        <li>Realizar comprobaciones rutinarias de verificación en el
                                                            montaje y mantenimiento de sistemas y/o instalaciones.
                                                        </li>
                                                        <li>Montar canalizaciones para cableado de datos en
                                                            condiciones de calidad y seguridad.
                                                        </li>
                                                        <li>Tender el cableado de redes de datos aplicando las
                                                            técnicas y procedimientos normalizados.
                                                        </li>
                                                        <li>Manejar las herramientas del entorno usuario
                                                            proporcionadas por el sistema operativo y los
                                                            dispositivos de almacenamiento de información.
                                                        </li>
                                                        <li>Manejar aplicaciones ofimáticas de procesador de textos
                                                            para realizar documentos sencillos.
                                                        </li>
                                                        <li>Realizar las tareas de su responsabilidad tanto
                                                            individualmente como en equipo, con autonomía e
                                                            iniciativa, adaptándose a las situaciones producidas por
                                                            cambios tecnológicos u organizativos.
                                                        </li>
                                                        <li>Adquirir hábitos de responsabilidad y autonomía basados
                                                            en la práctica de valores, favoreciendo las relaciones
                                                            interpersonales y profesionales, trabajando en equipo y
                                                            generando un ambiente favorable de convivencia que
                                                            permita integrarse en los distintos ámbitos de la
                                                            sociedad.
                                                        </li>
                                                        <li>Desarrollar hábitos y valores acordes con la
                                                            conservación y sostenibilidad del patrimonio natural,
                                                            analizando la interacción entre las sociedades humanas y
                                                            el medio natural y valorando las consecuencias que se
                                                            derivan de la acción humana sobre el medio.
                                                        </li>
                                                        <li>Valorar las diferentes manifestaciones artísticas y
                                                            culturales de forma fundamentada utilizándolas como
                                                            fuente de enriquecimiento personal y social y
                                                            desarrollando actitudes estéticas y sensibles hacia la
                                                            diversidad cultural y el patrimonio artístico.
                                                        </li>
                                                        <li>Comunicarse en diferentes situaciones laborales o
                                                            sociales utilizando recursos lingüísticos con precisión
                                                            y claridad, teniendo en cuenta el contexto y utilizando
                                                            formas orales y escritas básicas tanto de la propia
                                                            lengua como de alguna lengua extranjera.
                                                        </li>
                                                        <li>Resolver problemas predecibles relacionados con su
                                                            entorno social y productivo utilizando los elementos
                                                            proporcionados por las ciencias aplicadas y sociales y
                                                            respetando la diversidad de opiniones como fuente de
                                                            enriquecimiento en la toma de decisiones.
                                                        </li>
                                                        <li>Ejercer de manera activa y responsable los derechos y
                                                            deberes derivados tanto de su actividad profesional como
                                                            de su condición de ciudadano
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Plan de formación">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Los módulos de este ciclo formativo son los
                                                        siguientes:</p>
                                                    <ul>
                                                        <li class="ta-justify">Montaje y mantenimiento de sistemas y
                                                            componentes informáticos.
                                                        </li>
                                                        <li class="ta-justify">Operaciones auxiliares para la
                                                            configuración y la explotación.
                                                        </li>
                                                        <li class="ta-justify">Ofimática y archivo de documentos.</li>
                                                        <li class="ta-justify">Instalación y mantenimiento de redes para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Ciencias aplicadas I.</li>
                                                        <li class="ta-justify">Ciencias aplicadas II.</li>
                                                        <li class="ta-justify">Comunicación y sociedad I.</li>
                                                        <li class="ta-justify">Comunicación y sociedad II.</li>
                                                        <li class="ta-justify">Formación en centros de trabajo.</li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Al finalizar mis estudios, ¿Qué puedo hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Trabajar como:</p>

                                                    <ul>
                                                        <li class="ta-justify">Ayudante de montador de sistemas
                                                            microinformáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de mantenimiento de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Auxiliar de oficina.</li>
                                                        <li class="ta-justify">Auxiliar de servicios generales.</li>
                                                        <li class="ta-justify">Grabador-verificador de datos.</li>
                                                        <li class="ta-justify">Auxiliar de digitalización.</li>
                                                        <li class="ta-justify">Operador documental.</li>
                                                    </ul>

                                                    <p class="ta-justify">Seguir estudiando:</p>

                                                    <ul>
                                                        <li class="ta-justify">Un ciclo formativo de grado medio (Este
                                                            título tendrá preferencia para la admisión a todos los
                                                            títulos de grado medio de las familias profesionales de
                                                            Electricidad y Electrónica, Informática y Comunicaciones,
                                                            Fabricación Mecánica, Instalación y Mantenimiento, Energía y
                                                            Agua, Industrias Extractivas, Marítimo-Pesquera, Química,
                                                            Transporte y Mantenimiento de Vehículos, Madera, Mueble y
                                                            Corcho y Edificación y Obra Civil)
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Cuáles son las salidas profesionales?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Este profesional ejerce su actividad por
                                                        cuenta ajena en empresas dedicadas a la comercialización,
                                                        montaje, mantenimiento y reparación de sistemas
                                                        microinformáticos, equipos eléctricos o electrónicos y en
                                                        empresas que utilicen sistemas informáticos, para su
                                                        gestión.</p>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                    </q-collapsible>
                                    <q-collapsible class="q-pl-md" group="fpgs" icon="add"
                                                   label="Técnico Superior en Desarrollo de Aplicaciones Web">
                                        <q-collapsible group="fpBasicaOfi" label="Duración del estudio">
                                            <q-card>
                                                <q-card-main class="text-left">
                                                    2000 horas.
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Requisitos de acceso">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p>
                                                        El acceso a los ciclos de Formación Profesional
                                                        Básica requerirá el cumplimiento simultáneo de las
                                                        siguientes condiciones:
                                                    </p>
                                                    <ul style="list-style-type:disc">

                                                        <li> Tener cumplidos quince años, o cumplirlos durante
                                                            el año natural en curso, y no superar los diecisiete
                                                            años de edad en el momento del acceso o durante el
                                                            año natural en curso
                                                        </li>
                                                        <li>
                                                            Haber cursado el primer ciclo de Educación Secundaria
                                                            Obligatoria o, excepcionalmente, haber cursado el
                                                            segundo curso de la Educación Secundaria Obligatoria.
                                                        </li>
                                                        <li>
                                                            Haber propuesto el equipo docente a los padres, madres o
                                                            tutores legales la incorporación del alumno o alumna a
                                                            un ciclo de Formación Profesional Básica

                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Qué voy a aprender y hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <ul>
                                                        <li>Acopiar los materiales para acometer el montaje y/o
                                                            mantenimiento en sistemas microinformáticos y redes de
                                                            transmisión de datos.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de montaje de sistemas
                                                            microinformáticos y dispositivos auxiliares en
                                                            condiciones de calidad.
                                                        </li>
                                                        <li>Realizar operaciones auxiliares de mantenimiento y
                                                            reparación de sistemas microinformáticos garantizando su
                                                            funcionamiento.
                                                        </li>
                                                        <li>Realizar las operaciones para el almacenamiento y
                                                            transporte de sistemas, periféricos y consumibles,
                                                            siguiendo criterios de seguridad y catalogación.
                                                        </li>
                                                        <li>Realizar comprobaciones rutinarias de verificación en el
                                                            montaje y mantenimiento de sistemas y/o instalaciones.
                                                        </li>
                                                        <li>Montar canalizaciones para cableado de datos en
                                                            condiciones de calidad y seguridad.
                                                        </li>
                                                        <li>Tender el cableado de redes de datos aplicando las
                                                            técnicas y procedimientos normalizados.
                                                        </li>
                                                        <li>Manejar las herramientas del entorno usuario
                                                            proporcionadas por el sistema operativo y los
                                                            dispositivos de almacenamiento de información.
                                                        </li>
                                                        <li>Manejar aplicaciones ofimáticas de procesador de textos
                                                            para realizar documentos sencillos.
                                                        </li>
                                                        <li>Realizar las tareas de su responsabilidad tanto
                                                            individualmente como en equipo, con autonomía e
                                                            iniciativa, adaptándose a las situaciones producidas por
                                                            cambios tecnológicos u organizativos.
                                                        </li>
                                                        <li>Adquirir hábitos de responsabilidad y autonomía basados
                                                            en la práctica de valores, favoreciendo las relaciones
                                                            interpersonales y profesionales, trabajando en equipo y
                                                            generando un ambiente favorable de convivencia que
                                                            permita integrarse en los distintos ámbitos de la
                                                            sociedad.
                                                        </li>
                                                        <li>Desarrollar hábitos y valores acordes con la
                                                            conservación y sostenibilidad del patrimonio natural,
                                                            analizando la interacción entre las sociedades humanas y
                                                            el medio natural y valorando las consecuencias que se
                                                            derivan de la acción humana sobre el medio.
                                                        </li>
                                                        <li>Valorar las diferentes manifestaciones artísticas y
                                                            culturales de forma fundamentada utilizándolas como
                                                            fuente de enriquecimiento personal y social y
                                                            desarrollando actitudes estéticas y sensibles hacia la
                                                            diversidad cultural y el patrimonio artístico.
                                                        </li>
                                                        <li>Comunicarse en diferentes situaciones laborales o
                                                            sociales utilizando recursos lingüísticos con precisión
                                                            y claridad, teniendo en cuenta el contexto y utilizando
                                                            formas orales y escritas básicas tanto de la propia
                                                            lengua como de alguna lengua extranjera.
                                                        </li>
                                                        <li>Resolver problemas predecibles relacionados con su
                                                            entorno social y productivo utilizando los elementos
                                                            proporcionados por las ciencias aplicadas y sociales y
                                                            respetando la diversidad de opiniones como fuente de
                                                            enriquecimiento en la toma de decisiones.
                                                        </li>
                                                        <li>Ejercer de manera activa y responsable los derechos y
                                                            deberes derivados tanto de su actividad profesional como
                                                            de su condición de ciudadano
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Plan de formación">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Los módulos de este ciclo formativo son los
                                                        siguientes:</p>
                                                    <ul>
                                                        <li class="ta-justify">Montaje y mantenimiento de sistemas y
                                                            componentes informáticos.
                                                        </li>
                                                        <li class="ta-justify">Operaciones auxiliares para la
                                                            configuración y la explotación.
                                                        </li>
                                                        <li class="ta-justify">Ofimática y archivo de documentos.</li>
                                                        <li class="ta-justify">Instalación y mantenimiento de redes para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Ciencias aplicadas I.</li>
                                                        <li class="ta-justify">Ciencias aplicadas II.</li>
                                                        <li class="ta-justify">Comunicación y sociedad I.</li>
                                                        <li class="ta-justify">Comunicación y sociedad II.</li>
                                                        <li class="ta-justify">Formación en centros de trabajo.</li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="Al finalizar mis estudios, ¿Qué puedo hacer?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Trabajar como:</p>

                                                    <ul>
                                                        <li class="ta-justify">Ayudante de montador de sistemas
                                                            microinformáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de mantenimiento de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas
                                                            informáticos.
                                                        </li>
                                                        <li class="ta-justify">Ayudante de instalador de sistemas para
                                                            transmisión de datos.
                                                        </li>
                                                        <li class="ta-justify">Auxiliar de oficina.</li>
                                                        <li class="ta-justify">Auxiliar de servicios generales.</li>
                                                        <li class="ta-justify">Grabador-verificador de datos.</li>
                                                        <li class="ta-justify">Auxiliar de digitalización.</li>
                                                        <li class="ta-justify">Operador documental.</li>
                                                    </ul>

                                                    <p class="ta-justify">Seguir estudiando:</p>

                                                    <ul>
                                                        <li class="ta-justify">Un ciclo formativo de grado medio (Este
                                                            título tendrá preferencia para la admisión a todos los
                                                            títulos de grado medio de las familias profesionales de
                                                            Electricidad y Electrónica, Informática y Comunicaciones,
                                                            Fabricación Mecánica, Instalación y Mantenimiento, Energía y
                                                            Agua, Industrias Extractivas, Marítimo-Pesquera, Química,
                                                            Transporte y Mantenimiento de Vehículos, Madera, Mueble y
                                                            Corcho y Edificación y Obra Civil)
                                                        </li>
                                                    </ul>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                        <q-collapsible group="fpBasicaOfi" label="¿Cuáles son las salidas profesionales?">
                                            <q-card>
                                                <q-card-main class="text-left text-justify">
                                                    <p class="ta-justify">Este profesional ejerce su actividad por
                                                        cuenta ajena en empresas dedicadas a la comercialización,
                                                        montaje, mantenimiento y reparación de sistemas
                                                        microinformáticos, equipos eléctricos o electrónicos y en
                                                        empresas que utilicen sistemas informáticos, para su
                                                        gestión.</p>
                                                </q-card-main>
                                            </q-card>
                                        </q-collapsible>
                                    </q-collapsible>
                                </q-card>

                            </div>
                        </div>
                    </section>

                </div>
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
    .item .fa {
        font-size: 35px;
    }

    .item h4 {
        margin: 20px 0 25px 0;
    }
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
