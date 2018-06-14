/**
 * THIS FILE IS GENERATED AUTOMATICALLY.
 * DO NOT EDIT.
 *
 * You are probably looking on adding initialization code.
 * Use "quasar new plugin <name>" and add it there.
 * One plugin per concern. Then reference the file(s) in quasar.conf.js > plugins:
 * plugins: ['file', ...] // do not add ".js" extension to it.
 **/





import 'quasar-extras/material-icons'




import 'quasar-app-styl'


import 'src/css/app.styl'


import Vue from 'vue'
import Quasar, * as All from 'quasar'

Vue.config.productionTip = false
import App from 'src/App'

Vue.use(Quasar, {components: All, directives: All, plugins: All})




import router from 'src/router'


const app = {
  el: '#q-app',
  router,

  ...App
}


const plugins = []

import pluginAvue from 'src/plugins/avue'
plugins.push(pluginAvue)

plugins.forEach(plugin => plugin({ app, router, Vue }))








/* eslint-disable no-new */
new Vue(app)


