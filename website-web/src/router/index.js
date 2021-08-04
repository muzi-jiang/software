import Vue from 'vue'
import Router from 'vue-router'


Vue.use(Router)


import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
Vue.use(ElementUI)


//跳转路由
import index from '@/components/index'



export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: index
    }
  ]
})
