<template>
  <section>
    <table>
      <thead>
        <th>ID</th>
        <th>Title</th>
        <th>Release Date</th>
      </thead>
      <tbody>
        <tr v-for="movie in movies" :key="movie.id">
          <td>{{ movie.id }}</td>
          <td>{{ movie.title }}</td>
          <td>{{ movie.releaseDate }}</td>
        </tr>
      </tbody>
    </table>
  </section>
</template>

<script>
import movieService from "../services/MoviesService";

export default {
  created() {
    movieService.getMovies().then((response) => {
      this.$store.commit("SET_MOVIES", response.data);
    });
    // TODO .catch()
  },
  computed: {
    movies() {
      return this.$store.state.movies;
    },
  },
};
</script>

<style scoped>
</style>