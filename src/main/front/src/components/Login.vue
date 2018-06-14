<template>
    <div>
        Login
        <q-btn color="primary" label="login"
        />
        <form v-model="model">
            <q-input name="username"/>
            <q-input name="password"/>
            <q-input name="introduction"/>
        </form>

    </div>
</template>
<style>
</style>
<script lang="ts">
    import Vue from 'vue';
    import Component from 'vue-class-component';
    import axios from 'axios';
    import AForm from 'arteco-framework-vue-v2'

    @Component({
        name: 'login',
        components: {
            AForm
        }
    })
    export default class Login extends Vue {

        model = {username: '', password: '', introduction: ''};
        errored = false;

        // mounted() {
        //     axios
        //     // .get('https://api.coindesk.com/v1/bpi/currentprice.json')
        //         .post('http://localhost:8080/api/register', this.model)
        //         .then(response => {
        //             console.log(response);
        //             console.log('se ha registrado el usuario');
        //         })
        //         .catch(error => {
        //             // console.log(error);
        //             this.errored = true
        //         })
        // }

    }
</script>
