import App from 'src/App.vue';

declare let __API_BASE_PATH: string;


export default ({app, router, Vue}) => {


    app.render = h => h(App);
    // app.store = avue.store;
    // app.i18n = avue.i18n;
    // app.avue = avue;

    // serviceFactory.init(basePath);
};