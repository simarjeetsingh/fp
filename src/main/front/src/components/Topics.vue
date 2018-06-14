<template>
    <div>
        <div class="list">
            <q-breadcrumbs
                    separator="/"
                    active-color="primary"
                    class="q-my-md q-ml-sm"
            >
                <q-breadcrumbs-el label="Inicio" to="/"/>
                <q-breadcrumbs-el label="Foros" to="/foros"/>
            </q-breadcrumbs>
            <q-btn label="Publicar nuevo tema" @click="showPostModal" color="primary" size="md" class="q-my-md q-ml-md"/>
            <q-list v-for="(topic, key) in topicsList" :key="key" no-border>
                <q-item-separator class="q-ml-md q-my-sm"/>
                <q-item multiline>
                    <q-item-side class="user" inverted>
                    <span style="margin-left: 13px; font-size: 28px; color: white;" v-if="topic.user">
                        {{topic.user.username.toString().substring(0,1).toUpperCase()}}</span>
                    </q-item-side>
                    <q-item-main>
                        <q-item-tile label lines="2">
                            <a class="topicLabel" @click="$router.push('topic/' + topic.id)">{{topic.title}}</a>
                        </q-item-tile>
                        <q-item-tile sublabel lines="1" class="q-mt-md">
                            {{topic.createdDate.toString().substring(0, 10) + ' ' +
                            topic.createdDate.toString().substring(11, 16) + '  •  ' }}
                            <span v-if="topic.user" style="color: #000;">{{ topic.user.username}}</span>
                        </q-item-tile>
                    </q-item-main>
                    <q-item-side right>
                        <q-item-tile stamp label style="text-align: center">{{topic.answers.length}}</q-item-tile>
                        <q-item-tile stamp label>Respuestas</q-item-tile>
                    </q-item-side>
                </q-item>
            </q-list>
            <q-item-separator class="q-ml-md q-my-md"/>
        </div>
        <a-modal ref="postModal" flat-actions maximized position="bottom" alignActions="right">
            <form @submit.prevent="submitTopic" class="q-ml-md">
                <q-input class="q-my-md q-ml-lg" float-label="Título" v-model="model.title"/>
                <!--<q-input class="a-input q-my-md" float-label="Categoria" v-model="model.category"/>-->
                <!--<q-editor class="q-my-md" v-model="model.content"/>-->
                <q-input float-label="Contenido" class="q-my-md q-ml-lg" type="textarea" rows="5" v-model="model.content"/>
                <q-btn size="md" label="enviar" class="q-my-md q-ml-lg"  color="primary" type="submit" style="width: 10%"/>
            </form>
        </a-modal>
    </div>
</template>
<style>
    .list {
        max-width: 1140px;
        margin-left: 105px;
    }

    .user {
        border-radius: 50%;
        width: 46px;
        height: 46px;
        background-color: seagreen;
        line-height: 46px;
        font-size: 2.4rem;
    }

    .topicLabel {
        cursor: pointer;
        font-weight: 700;
        font-size: 18px;
    }
</style>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';
    import {Prop} from 'vue-property-decorator';
    import axios from 'axios';
    import Quasar from "arteco-framework-vue-v2/dist/src/definitions/quasar";
    import AModal from './AModal'

    @Component({
        name: 'topics',
        components: {AModal}
    })
    export default class Topics extends Vue {
        $q: Quasar;
        topicsList = [];
        model = {title: '', content: '', category: ''};
        @Prop() id: string;
        userId = null;

        mounted() {
            if (localStorage.getItem('userId')) {
                this.userId = JSON.parse(localStorage.getItem('userId'))
            }
            this.getTopics();
        }

        showPostModal() {
            (<AModal> this.$refs.postModal).open();
        }

        closePostModal() {
            (<AModal> this.$refs.postModal).close();
        }

        getTopics() {
            axios
                .get('http://localhost:8080/api/topics')
                .then(response => {
                    console.log(response);
                    this.topicsList = response.data;
                })
                .catch(error => {
                })
        }

        submitTopic() {

            axios
                .post('http://localhost:8080/api/newTopic/' + this.userId,
                    {title: this.model.title, content: this.model.content, category: this.model.category})
                .then(response => {
                    if (response.status === 200) {
                        this.$q.notify({
                            type: 'positive',
                            message: 'Se ha añadido con éxito'
                        });
                        this.closePostModal();
                        this.getTopics();
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
</script>
