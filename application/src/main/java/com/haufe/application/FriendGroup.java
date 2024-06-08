package com.haufe.application;

import java.util.ArrayList;

public class FriendGroup {
    private String name;
    private ArrayList<User> userList;
    private ArrayList<Recommendation> recommendations = new ArrayList<Recommendation>();

    public FriendGroup(String name, ArrayList<User> userList) {
        this.name = name;
        this.userList = userList;
    }

    public String getName() {
        return name;
    }

    public void addRecommendation(Recommendation recommendation) {
        recommendations.add(recommendation);
    }

    public ArrayList<Recommendation> getRecommendations() {
        return recommendations;
    }
}
