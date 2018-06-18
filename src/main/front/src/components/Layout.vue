<template>
    <q-layout color="primary">
        <!-- Header -->
        <q-layout-header class="site-header">
            <div class="wrap" style="width: 1140px;">
                <div class="title-area">
                    <p>
                        <a @click="$router.push('/')" style="cursor: pointer">
                            <span class="brackets">{Fp} Informática</span>
                        </a>
                    </p>
                </div>
                <div class="widget-area">
                    <section id="nav_menu-3">
                        <div>
                            <nav class="nav-header">
                                <ul class="menu nav-menu">
                                    <li class="menu-item">
                                        <a @click="$router.replace('/fp')" style="cursor: pointer">
                                            <span>¿Qué es la FP?</span>

                                        </a>
                                        <!--<ul class="sub-menu">-->
                                            <!--<li class="menu-item ">-->
                                                <!--<a @click="$router.replace('/acceso')" style="cursor: pointer">-->
                                                    <!--<span>Cómo acceder</span>-->
                                                <!--</a>-->
                                            <!--</li>-->
                                        <!--</ul>-->
                                    </li>
                                    <li class="menu-item">
                                        <a @click="$router.replace('/ciclos')" style="cursor: pointer">
                                            <span>Ciclos</span>
                                        </a>
                                    </li>
                                    <li class="menu-item">
                                        <a @click="$router.replace('/profesion')" style="cursor: pointer">
                                            <span>La profesión</span>
                                        </a>
                                    </li>
                                    <li class="menu-item">
                                        <a @click="$router.replace('/foros')" style="cursor: pointer">
                                            <span>Foros</span></a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </section>
                    <section id="text-17" class="widget widget_text">
                        <div class="widget-wrap">
                            <nav class="nav-header">
                                <ul v-if="!showLogout" class="menu nav-menu">
                                    <li class="menu-item">
                                        <a @click="showRegisterModal" style="cursor: pointer; padding: 0 10px">
                                            Registro</a>
                                    </li>
                                    <li class="menu-item">
                                        <a @click="showLoginModal" style="cursor: pointer; padding: 0;">Login</a>
                                    </li>
                                </ul>
                                <ul v-else class="menu nav-menu">
                                    <li class="menu-item">
                                        <a style="cursor: pointer; padding: 0 10px">
                                            {{userDto.username}}
                                        </a>
                                    </li>
                                    <li class="menu-item">
                                        <a @click="logout()" style="cursor: pointer; padding: 0 10px">
                                            Salir
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </section>
                </div>
            </div>
        </q-layout-header>
        <a-modal ref="loginModal" flat-actions minimized alignActions="right">
            <form @submit.prevent="userLogin" class="q-ml-md">
                <q-input icon="mail" float-label="Nombre de usuario" class="q-my-md" name="username"
                         v-model="loginModel.username"/>
                <q-input float-label="Contraseña" type="password" class="q-my-md" name="password" v-model="loginModel.password"/>
                <q-btn size="md" label="login" color="primary" type="submit" class="float-right "/>
            </form>
        </a-modal>

        <a-modal ref="registerModal" flat-actions minimized alignActions="right">
            <form @submit.prevent="register" class="q-ml-md">
                <q-input float-label="Nombre de usuario" class="q-my-md" v-model="registerModel.username"/>
                <q-input float-label="Contraseña" type="password" class="q-my-md" v-model="registerModel.password"/>
                <q-input float-label="Introducción" class="q-my-md" v-model="registerModel.introduction"/>
                <q-btn size="md" label="Registrar" color="primary" type="submit" class="float-right"/>
            </form>
        </a-modal>
        <!-- sub-routes get injected here: -->
        <q-page-container>
            <router-view/>
        </q-page-container>

        <q-layot-footer >
            <footer class="container-fluid" id="footer">
                <div class="col-md-12 footerDiv col-xs-12 text-center">
                    <a href="https://www.facebook.com" target="_blank" class="q-mr-md">
                        <i class="fab fa-facebook-f" style="font-size: 20px;"></i>
                    </a>
                    <a href="https://www.twitter.com" target="_blank" class="q-mr-md">
                        <i class="fab fa-twitter" style="font-size: 20px;"></i>
                    </a>
                    <a href="https://www.snapchat.com" target="_blank" class="q-mr-md">
                        <i class="fab fa-snapchat" style="font-size: 20px;"></i>
                    </a>
                    <a href="https://www.instagram.com/" target="_blank" class="q-mr-md"><i
                            class="fab fa-instagram" style="font-size: 20px;"></i>
                    </a>
                    <a href="https://www.linkedin.com/" target="_blank" class="q-mr-md"><i
                            class="fab fa-linkedin" style="font-size: 20px;"></i></a>
                    <a href="https://www.plus.google.com" target="_blank" class="q-mr-md">
                        <i class="fab fa-google-plus-g" style="font-size: 20px;"></i>
                    </a>
                    <a href="https://www.youtube.com/" target="_blank"><i
                            class="fab fa-youtube" style="font-size: 20px;"></i>
                    </a>
                    <p class="text-center copyright">© 2018, Simarjeet Singh, Todos los derechos reservados.</p>
                </div>
            </footer>
        </q-layot-footer>
    </q-layout>
</template>
<style>
    h1, h2, h3, h4, h5, h6, .site-header, p {
        font-family: "Roboto", sans-serif;
    }

    .site-header {
        /*background-color: #000;*/
        /*background-color: darkslategray;*/
        background-color: #242B35;
        left: 0;
        position: fixed;
        top: 0;
        width: 100%;
        z-index: 999;
    }

    .site-header .wrap {
        max-width: 1140px;
        margin-left: 105px;
    }

    .title-area {
        padding: 0;
        float: none;
        position: absolute;
        top: 0px;
        width: auto;
        line-height: 64px;
    }

    .site-header .widget-area {
        float: none;
        text-align: center;
        width: auto;
    }

    section#nav_menu-3 {
        display: inline-block;
        margin-left: 215px;
    }

    .nav-menu {
        clear: both;
        color: #fff;
        font-family: Montserrat, sans-serif;
        font-size: 16px;
        font-weight: 400;
        letter-spacing: 1px;
        line-height: 1;
        width: 100%;
    }

    .widget-area ol, .widget-area ul {
        margin: 0;
        padding: 0;
        color: #ffffff;
        font-family: Roboto, sans-serif;
        font-size: 16px;
    }

    .nav-menu .menu-item {
        display: inline-block;
        text-align: left;
    }

    .nav-menu a {
        padding: 0 20px;
        line-height: 70px;
        transition: background .3s;
        display: block;
    }

    section#text-17 {
        display: inline-block;
        float: right;
    }

    #text-17.widget .textwidget a {
        font-size: 16px;
        text-transform: none;
        margin-top: 15px;
        line-height: 37px;
        display: block;
        transition: color .3s;
        color: #fff;
    }

    .brackets {
        color: #699e4f;
        font-family: Roboto, sans-serif;
        font-size: 26px;
        font-style: italic;
    }

    a {
        text-decoration: none;
    }

    .nav-menu .menu-item:hover {
        background-color: #444;
    }

    .nav-menu .menu-item:hover .sub-menu {
        /*display: block;*/
        opacity: 1;
        visibility: visible;
        /*transition-delay: 0.1s;*/
    }

    .nav-menu .sub-menu {
        padding: 20px 0 10px;
        background-color: #444;
        width: 300px;
        position: absolute;
        /*display: none;*/
        visibility: hidden;
        z-index: 1;
        opacity: 0;
        /*transition: visibility 0s, opacity 0.5s linear;*/
        transition: opacity .4s ease-in-out;
    }

    a:link {
        color: #699e4f;
        background-color: transparent;
        text-decoration: none;
    }

    a:visited {
        color: white;
        background-color: transparent;
        text-decoration: none;
    }

    a:hover {
        color: #699e4f;
        background-color: transparent;
        text-decoration: none;
    }

    a:active {
        color: #699e4f;
        background-color: transparent;
        text-decoration: none;
    }
</style>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';
    import AModal from './AModal'
    import AInput from './AInput'
    import axios from 'axios';
    import Quasar from "arteco-framework-vue-v2/dist/src/definitions/quasar";
    import {Prop} from "vue-property-decorator";

    @Component({
        name: 'layout',
        components: {AModal, AInput}
    })
    export default class Layout extends Vue {
        @Prop() userId: string;
        $q: Quasar;
        showLogout: boolean = false;
        registerModel = {username: '', password: '', introduction: ''};
        loginModel = {username: '', password: ''};
        userDto = {};


        showLoginModal() {
            (<AModal> this.$refs.loginModal).open();
        }

        closeLoginModal() {
            (<AModal> this.$refs.loginModal).close();
        }

        showRegisterModal() {
            (<AModal> this.$refs.registerModal).open();
        }

        closeRegisterModal() {
            (<AModal> this.$refs.registerModal).close();
        }

        logout() {
            this.showLogout = false;
            localStorage.removeItem('userId');
        }

        userLogin() {
            console.log('login clicked');
            if (this.loginModel.username === null || this.loginModel.username === '' || this.loginModel.password === null || this.loginModel.password === '') {
                this.$q.notify({
                    type: 'negative',
                    message: 'Campos obligatorios vacíos',
                    position: 'top',
                    timeout: 1000,
                })
            } else {
                axios
                    .post('http://localhost:8080/api/login', {
                        username: this.loginModel.username,
                        password: this.loginModel.password
                    })
                    .then(response => {
                        this.userDto = response.data;
                        localStorage.setItem('userId', JSON.stringify(response.data.id));
                        this.showLogout = true;
                        this.closeLoginModal();
                        console.log(response);
                    })
                    .catch(error => {
                        console.log(error);
                    })
            }
        }

        register() {
            let data = JSON.stringify({
                username: this.registerModel.username,
                password: this.registerModel.password,
                introduction: this.registerModel.introduction
            });

            if (this.loginModel.username === null || this.loginModel.username === '' || this.loginModel.password === null || this.loginModel.password === '') {
                this.$q.notify({
                    type: 'negative',
                    message: 'Campos obligatorios vacíos',
                    position: 'top',
                    timeout: 1000,
                })
            } else {
                axios
                    .post('http://localhost:8080/api/register', data, {
                        headers: {
                            'Content-Type': 'application/json',
                        }
                    })
                    .then(response => {
                        if (response.status === 200) {
                            this.$q.notify({
                                type: 'positive',
                                message: 'El usuario se ha registrado correctamente'
                            });
                            this.closeRegisterModal();
                        } else {
                            this.$q.notify({
                                type: 'negative',
                                message: 'algo ha ido mal'
                            })
                        }
                        console.log(response);
                    })
                    .catch(error => {
                        console.log(error);
                    })
            }
        }

    }
</script>
