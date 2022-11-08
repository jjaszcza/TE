package com.techelevator.controller;

import com.techelevator.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {
    @GetMapping
    public List<Movie> getMoviesList() {

    }
}
