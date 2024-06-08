package com.haufe.application;

import java.util.Objects;

public final class DataHandler {

    private static DataHandler INSTANCE;
    public Movie selectedMovie = null;
    public User currentUser = null;
    public FriendGroup selectedFriendGroup = null;

    private DataHandler() {}

    public static DataHandler getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DataHandler();
        }
        return INSTANCE;
    }

    public FriendGroup findFriendGroupByName(String name) {
        for(FriendGroup friendGroup : currentUser.getGroupList()) {
            if(Objects.equals(friendGroup.getName(), name)) {
                return friendGroup;
            }
        }
        return null;
    }

    public User getFriendByName(String friendName) {
        for(User friend : currentUser.getFriendList()) {
            if(Objects.equals(friend.getUsername(), friendName)) {
                return friend;
            }
        }
        return null;
    }
}
