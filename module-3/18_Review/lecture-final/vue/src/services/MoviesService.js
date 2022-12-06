import http from 'axios';

export default {

    getMovies() {
        return http.get("/movies");
    }

}