package com.techelevator.dao;

import com.techelevator.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcMoviesDao implements MoviesDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcMoviesDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Movie> getMovies() {
        final String sql = "SELECT movie_id, title, release_date FROM movie;";
        final SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql);
        final List<Movie> movies = new ArrayList<>();
        while(results.next()) {
            LocalDate releaseDate = null;
            if (results.getDate("release_date") != null) {
                releaseDate = results.getDate("release_date").toLocalDate();
            }

            final Movie movie = new Movie(
                    results.getInt("movie_id"),
                    results.getString("title"),
                    releaseDate
            );

            movies.add(movie);
        }

        return movies;
    }
}
