package com.haufe.application;

import java.util.ArrayList;
import java.util.Objects;

public class Catalogue {
    private ArrayList<Movie> catalogue;

    public Catalogue() {
        catalogue = new ArrayList<Movie>();
    }

    public void addMovie(Movie movie) {
        catalogue.add(movie);
    }

    public ArrayList<Movie> getCatalogue() {
        return catalogue;
    }

    public Movie getMovieByName(String name) {
        for(Movie movie : catalogue) {
            if(Objects.equals(movie.getName(), name)) {
                return movie;
            }
        }
        return null;
    }
}
