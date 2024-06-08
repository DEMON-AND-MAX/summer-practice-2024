package com.haufe.application;

import java.util.ArrayList;

public class User {
    private final int id;
    private final String username;
    private Catalogue catalogue;
    private ArrayList<User> friendList;
    private ArrayList<FriendGroup> groupList;

    public User(int id, String username, Catalogue catalogue, ArrayList<User> friendList, ArrayList<FriendGroup> groupList) {
        this.id = id;
        this.username = username;
        this.catalogue = catalogue;
        this.friendList = friendList;
        this.groupList = groupList;
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<FriendGroup> getGroupList() {
        return groupList;
    }
    public ArrayList<User> getFriendList() {
        return friendList;
    }
}
