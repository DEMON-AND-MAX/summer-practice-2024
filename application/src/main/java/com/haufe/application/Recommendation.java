package com.haufe.application;

import java.util.ArrayList;

public class Recommendation {
    private int id;
    private Movie movie;
    private User user;
    private String comment;

    public Recommendation(int id, Movie movie, User user, String comment) {
        this.id = id;
        this.movie = movie;
        this.user = user;
        this.comment = comment;
    }

    public Movie getMovie() {
        return movie;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }
}
