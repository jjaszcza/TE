<template>
  <div>
    <reading-list></reading-list>
    <router-link :to="{ name: 'new-book' }"
      >Add Book to Reading List</router-link
    >
  </div>
</template>

<script>
import ReadingList from "../components/ReadingList.vue";
export default {
  components: {
    ReadingList,
  },
};
</script>

<style>
</style>