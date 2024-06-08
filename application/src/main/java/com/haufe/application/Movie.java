package com.haufe.application;

import java.util.ArrayList;

public class Movie {
    private final int id;
    private final String name;
    private final String desc;
    private final int rating;
    private final String imageLink;
    private ArrayList<Review> reviews = new ArrayList<Review>();

    public Movie(int id, String name, String desc, int rating, String imageLink) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.imageLink = imageLink;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public String getImageLink() {
        return imageLink;
    }
}
