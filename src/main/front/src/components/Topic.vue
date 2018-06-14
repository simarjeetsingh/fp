<template>
    <div class="list">
        <q-breadcrumbs
                separator="/"
                active-color="primary"
                class="q-my-md q-ml-sm"
        >
            <q-breadcrumbs-el label="Inicio" to="/" />
            <q-breadcrumbs-el label="Foros" to="/foros" />
            <q-breadcrumbs-el :label="topic.title"/>
        </q-breadcrumbs>
        <h5 class="q-my-lg q-ml-md">{{topic.title}}</h5>
        <q-item-separator class="q-ml-md q-my-md"/>
        <q-list no-border>
            <q-item multiline>
                <!--<q-item-side icon="folder" inverted/>-->
                <q-item-side class="user" inverted>
                    <span style="margin-left: 12px; font-size: 28px; color: white;" v-if="topic.user">
                        {{topic.user.username.toString().substring(0,1).toUpperCase()}}</span>
                </q-item-side>
                <q-item-main>
                    <q-item-tile label class="q-mb-md">
                        {{topic.createdDate.toString().substring(0, 10) + ' ' + topic.createdDate.toString().substring(11, 16)}}
                        <span v-if="topic.user">{{'  •  ' + topic.user.username}}</span>
                    </q-item-tile>
                    <q-item-tile label lines="5">
                        {{topic.content}}
                    </q-item-tile>
                </q-item-main>
            </q-item>
        </q-list>
        <q-list v-for="(answer, key) in topic.answers" :key="key" no-border>
            <q-item-separator class="q-ml-lg q-my-md"/>
            <q-item multiline>
                <q-item-side class="user" inverted>
                    <span style="margin-left: 14px; font-size: 28px; color: white;" v-if="topic.user">
                        {{answer.user.username.toString().substring(0,1).toUpperCase()}}</span>
                </q-item-side>
                <q-item-main>
                    <q-item-tile label lines="1" class="q-mb-md">
                        {{answer.createdDate.toString().substring(0, 10) + ' ' + answer.createdDate.toString().substring(11, 16)}}
                        <span v-if="answer.user" class="userLabel">{{'  •  ' + answer.user.username}}</span>
                    </q-item-tile>
                    <q-item-tile label lines="10">
                        {{answer.content}}
                    </q-item-tile>
                    <q-item-tile sublabel lines="2">
                        {{answer.code}}
                    </q-item-tile>
                </q-item-main>
            </q-item>
        </q-list>
        <q-item-separator class="q-ml-md q-my-md"/>
        <q-btn label="Publicar respuesta" @click="showAnswerModal" color="primary" size="md" class="q-my-md q-ml-md"/>
        <a-modal ref="answerModal" flat-actions maximized position="bottom" alignActions="right">
            <form @submit.prevent="submitAnswer">
                <q-input float-label="Contenido" class="q-my-md q-ml-md" type="textarea" rows="7" v-model="model.content"/>
                <!--<q-input float-label="Código" class="q-my-md q-ml-md" type="textarea" v-model="model.code"/>-->
                <q-btn size="md" class="q-my-md q-ml-md" label="Enviar" color="primary" type="submit" style="width: 10%"/>
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

    .userLabel {
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

    @Component({name: 'topic',
        components: {AModal}
    })
    export default class Topic extends Vue {
        @Prop() id: string;
        userId = null;

        $q: Quasar;
        topic = {};
        model = {content: '', code: ''};

        mounted() {
            if (localStorage.getItem('userId')) {
                this.userId = JSON.parse(localStorage.getItem('userId'))
            }
            this.getTopic();
        }

        showAnswerModal() {
            (<AModal> this.$refs.answerModal). open();
        }

        closeAnswerModal() {
            (<AModal> this.$refs.answerModal).close();
        }

        getTopic() {
            axios
                .get('http://localhost:8080/api/topic/' + this.id,)
                .then(response => {
                    console.log(response);
                    this.topic = response.data
                })
                .catch(error => {
                })
        }

        submitAnswer() {
            if (localStorage.getItem('userId')) {
                this.userId = JSON.parse(localStorage.getItem('userId'))
            }
            axios
                .post('http://localhost:8080/api/topic/' + this.userId + '/'+this.id + '/addAnswer',
                    {content: this.model.content, code: this.model.code})
                .then(response => {
                    if (response.status === 200) {
                        this.$q.notify({
                            type: 'positive',
                            message: 'Se ha añadido con éxito'
                        });
                        this.closeAnswerModal();
                        this.getTopic();
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
