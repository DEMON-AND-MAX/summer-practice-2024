package com.haufe.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FriendListController implements Initializable {
    @FXML
    private VBox vBoxFriends;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<User> userGroupList = DataHandler.getInstance().currentUser.getFriendList();
        for(User friend : userGroupList) {
            Text text = new Text();
            text.setText(friend.getUsername());
            vBoxFriends.getChildren().add(text);
        }
    }

    public void buttonPressedReturn(ActionEvent event) {
        StageHandler.switchStage(event, "catalogue.fxml");
    }
}
