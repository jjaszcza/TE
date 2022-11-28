import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '../views/Products.vue'
import ProductDetails from '../views/ProductDetail.vue'
import AddReview from "../views/AddReview.vue"

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'products',
    component: Products
  },
  {
    path: '/products/:id', //a token to hold the ID of the product
    name: 'product-details',
    component: ProductDetails
  },
  {
    path: '/products/:id/addreview',
    name: 'add-review',
    component: AddReview
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
