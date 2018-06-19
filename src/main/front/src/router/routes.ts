import {RouteConfig} from 'vue-router';
import Index from '../components/Index.vue';
import Login from '../components/Login.vue';
import Register from '../components/Register.vue';
import Topics from '../components/Topics.vue';
import Topic from '../components/Topic.vue';
import Layout from '../components/Layout.vue';
import Fp from '../components/Fp.vue';
import Ciclos from '../components/Ciclos.vue';
import Profesion from '../components/Profesion.vue';
import AParent from '../components/AParent.vue';
import Empresa from '../components/Empresa.vue';

let routes: RouteConfig[] = [
    {path: '/', component: Layout, children: [
            {path: '',  component: AParent, children: [
                    {path: '', component: Index},
                    {path: 'fp', component: Fp},
                    {path: 'ciclos', component: Ciclos},
                    {path: 'foros', component: Topics},
                    {path: 'profesion', component: Profesion},
                    {path: 'fct', component: Empresa},
                    {path: '/topic/:id', component: Topic, props: true},
                ]},
            { path: 'login',  component: Login},
            { path: 'register',  component: Register},

        ]}

];
export default routes;