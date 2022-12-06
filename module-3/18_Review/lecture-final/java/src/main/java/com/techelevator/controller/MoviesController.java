package com.techelevator.controller;

import com.techelevator.dao.MoviesDao;
import com.techelevator.model.Movie;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@PreAuthorize("isAuthenticated()")
public class MoviesController {

    private MoviesDao moviesDao;

    public MoviesController(MoviesDao moviesDao) {
        this.moviesDao = moviesDao;
    }

    @GetMapping("/movies")
    public List<Movie> getAll() {
        return this.moviesDao.getMovies();
    }

}
