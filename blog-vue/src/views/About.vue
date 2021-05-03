<template>
  <div>
    <Header></Header>

    <div class="mblog">
      <h2> 关于我</h2>
      <el-divider></el-divider>
      <div>目前研究生在读，专业为计算机技术，在这里总结记录一些技术与学习日常 </div>
      <div>
        <el-link type="success" href="https://juejin.cn/post/6844903823966732302">博客模板参考链接</el-link>
      </div>
    </div>

  </div>
</template>
<script>
  import Header from "../components/Header";
  export default {
    name: "About.vue",
    components: {Header}
  }
</script>
<style scoped>
  .mblog {
    box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
    width: 100%;
    min-height: 300px;
    padding: 20px 15px;
  }

</style>