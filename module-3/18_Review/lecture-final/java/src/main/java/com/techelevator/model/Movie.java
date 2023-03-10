package com.techelevator.model;

import java.time.LocalDate;

public class Movie {
    private int id;
    private String title;
    private LocalDate releaseDate;

    public Movie(int id, String title, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
