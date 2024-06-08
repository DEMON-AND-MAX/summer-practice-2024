package com.haufe.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class FriendGroupsController implements Initializable {
    @FXML
    private ListView<String> listViewFriendGroups;
    @FXML
    private Button buttonReturn;
    @FXML
    private TextField textFieldGroupName;
    @FXML
    private ListView<String> listViewFriends;

    public void buttonPressedReturn(ActionEvent event) {
        StageHandler.switchStage(event, "catalogue.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<FriendGroup> userGroupList = DataHandler.getInstance().currentUser.getGroupList();
        listViewFriends.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        for(FriendGroup friendGroup : userGroupList) {
            listViewFriendGroups.getItems().add(friendGroup.getName());
        }
        for(User friend : DataHandler.getInstance().currentUser.getFriendList()) {
            listViewFriends.getItems().add(friend.getUsername());
        }
    }

    public void buttonPressedViewGroup(ActionEvent event) {
        FriendGroup selectedFriendGroup = DataHandler.getInstance().findFriendGroupByName(listViewFriendGroups.getSelectionModel().getSelectedItem());
        DataHandler.getInstance().selectedFriendGroup = selectedFriendGroup;
        StageHandler.switchStage(event, "viewFriendGroup.fxml");
    }

    public void buttonPressedCreateGroup(ActionEvent event) {
        if(!Objects.equals(textFieldGroupName.getText(), "")) {
            ArrayList<User> friendList = new ArrayList<>();
            for(String friendName : listViewFriends.getSelectionModel().getSelectedItems()) {
                friendList.add(DataHandler.getInstance().getFriendByName(friendName));
            }
            friendList.add(DataHandler.getInstance().currentUser);
            FriendGroup friendGroup = new FriendGroup(textFieldGroupName.getText(),
                    friendList);
            DataHandler.getInstance().currentUser.getGroupList().add(friendGroup);
            listViewFriendGroups.getItems().add(friendGroup.getName());
            textFieldGroupName.setText("");
        }
    }
}
