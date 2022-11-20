<template>
  <div class="main">
    <h2>Product Reviews for {{ name }}</h2>
    <p class="description">{{ description }}</p>

    <div class="well-display">
      <div class="well">
        <span class="amount">{{ averageRating.toFixed(2) }}</span>
        Average Rating
      </div>
      <div class="well" v-for="n in 5" v-bind:key="n">
        <span class="amount">{{ numberOfReviewByRating(n) }}</span> {{ n }} star
        ratings
      </div>
    </div>

    <!-- duplicate this element once for each review -->
    <div
      class="review"
      v-for="review in reviews"
      v-bind:key="review.id"
      v-bind:class="{ favorite: review.favorite === true }"
    >
      <h4>{{ review.reviewer }}</h4>
      <div class="rating">
        <img
          src="../assets/star.png"
          v-for="n in review.rating"
          v-bind:key="n"
          v-bind:title="review.rating + ' star review'"
        />
      </div>
      <h3>{{ review.title }}</h3>
      <p>{{ review.review }}</p>
      <p>Favorite? <input type="checkbox" v-model="review.favorite" /></p>
    </div>
  </div>
</template>

<script>
export default {
  name: "product-reviews",
  data() {
    return {
      name: "Cigar Parties for Dummies",
      description: "Host and plan the perfect party",
      reviews: [
        {
          id: 1,
          reviewer: "mike",
          title: "great read",
          review: "how to throw an excellent party",
          rating: 5,
          favorite: false,
        },
        {
          id: 2,
          reviewer: "dave",
          title: "meh",
          review: "meh at best",
          rating: 3,
          favorite: false,
        },
        {
          id: 3,
          reviewer: "julian",
          title: "awesome",
          review: "what a nice book",
          rating: 5,
          favorite: false,
        },
      ],
    };
  },
  computed: {
    averageRating() {
      const sum = this.reviews.reduce(
        (sum, review) => (sum += review.rating),
        0
      );
      return sum / this.reviews.length;
    },
  },
  methods: {
    numberOfReviewByRating(rating) {
      return this.reviews.filter((r) => r.rating === rating).length;
    },
  },
};
</script>

<style scoped>
div.main {
  margin: 1rem 0;
}
</style>