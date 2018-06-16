import App from 'src/App.vue';

export default ({app, router, Vue}) => {
    app.render = h => h(App);
};