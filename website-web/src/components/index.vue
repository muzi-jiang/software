<template>
  <div class="index" id="index">
      <div v-for="item in list" v-bind:key="item.id" class="application">
          <img :src="item.url" alt="图片错误" class="application_img">
          <div class="application_name">{{item.name}}</div>
      </div>
  </div>
</template>

<script>
export default {
  name: 'index',
  data () {
    return {
      list: [
        {'id':1,'url':'https://img2.baidu.com/it/u=2102736929,2417598652&fm=26&fmt=auto&gp=0.jpg', 'name':'我的应用1'},
        {'id':2,'url':'https://img2.baidu.com/it/u=2102736929,2417598652&fm=26&fmt=auto&gp=0.jpg', 'name':'我的应用2'},
        {'id':3,'url':'https://img2.baidu.com/it/u=2102736929,2417598652&fm=26&fmt=auto&gp=0.jpg', 'name':'我的应用3'},
        {'id':4,'url':'https://img2.baidu.com/it/u=2102736929,2417598652&fm=26&fmt=auto&gp=0.jpg', 'name':'我的应用4'},
        {'id':5,'url':'https://img2.baidu.com/it/u=2102736929,2417598652&fm=26&fmt=auto&gp=0.jpg', 'name':'我的应用5'},
        {'id':6,'url':'https://img2.baidu.com/it/u=2102736929,2417598652&fm=26&fmt=auto&gp=0.jpg', 'name':'我的应用5'},
        {'id':7,'url':'https://img2.baidu.com/it/u=2102736929,2417598652&fm=26&fmt=auto&gp=0.jpg', 'name':'我的应用5'},
        {'id':8,'url':'https://img2.baidu.com/it/u=2102736929,2417598652&fm=26&fmt=auto&gp=0.jpg', 'name':'我的应用5'},
        {'id':9,'url':'https://img2.baidu.com/it/u=2102736929,2417598652&fm=26&fmt=auto&gp=0.jpg', 'name':'我的应用5'},
      ]
    }
  },
  created(){
      var index = document.getElementById('index')
      index.style.width=document.body.clientWidth
      index.style.height=document.body.clientHeight
  }

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    .index .application{
      margin-top: 20px;
      margin-left: 20px;
      word-break: break-all;
    }

    .index .application_img{
      width: 80px;
      height: 80px;
      background-color: violet;
    }
    .application_name{
      font-family: '正楷';
      font-size: 15px;
    }
</style>
