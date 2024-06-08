package com.haufe.application;

public class Review {
    private User user;
    private int rating;
    private String desc;

    public Review(User user, int rating, String desc) {
        this.user = user;
        this.rating = rating;
        this.desc = desc;
    }

    public User getUser() {
        return user;
    }

    public int getRating() {
        return rating;
    }

    public String getDesc() {
        return desc;
    }
}
