let avue_quasar_config = require('./node_modules/arteco-framework-vue-v2/dist/quasar.js');
const webpack = require('webpack');

module.exports = function (ctx) {
    let defaultConfig = avue_quasar_config(ctx);

    let myConfig = {
        devServer: {
            port: 8081,
        },
        build: {
            extendWebpack(cfg) {
                defaultConfig.build.extendWebpack(cfg);

                cfg.plugins.push(new webpack.DefinePlugin({
                    '__API_BASE_PATH': ctx.dev ? '"http://localhost:8081"' : 'PRODUCTION_URL'
                }));
            }
        }
    };
    return Object.assign({}, defaultConfig, myConfig)
};