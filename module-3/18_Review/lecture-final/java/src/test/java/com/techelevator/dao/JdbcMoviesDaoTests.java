package com.techelevator.dao;

import com.techelevator.model.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcMoviesDaoTests extends BaseDaoTests {

    private JdbcMoviesDao sut;

    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        sut = new JdbcMoviesDao(jdbcTemplate);
    }

    @Test
    public void canFetchMovies() {
        final List<Movie> movies = sut.getMovies();
        Assert.assertFalse("should be able to fetch all the movies", movies.isEmpty());
    }

}
