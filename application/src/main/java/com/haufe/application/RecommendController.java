package com.haufe.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class RecommendController implements Initializable {

    @FXML
    private ListView<String> listViewGroups;
    @FXML
    private TextArea textAreaRecommendation;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listViewGroups.getItems().clear();
        listViewGroups.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        for(FriendGroup friendGroup : DataHandler.getInstance().currentUser.getGroupList()) {
            listViewGroups.getItems().add(friendGroup.getName());
        }
    }

    public void buttonPressedReturn(ActionEvent event) {
        StageHandler.switchStage(event, "movie.fxml");
    }

    public void buttonPressedSend(ActionEvent event) {
        for(String groupName: listViewGroups.getSelectionModel().getSelectedItems()) {
            FriendGroup currentGroup = DataHandler.getInstance().findFriendGroupByName(groupName);
            Recommendation recommendation = new Recommendation(1,
                    DataHandler.getInstance().selectedMovie,
                    DataHandler.getInstance().currentUser,
                    textAreaRecommendation.getText());
            currentGroup.addRecommendation(recommendation);
        }
        StageHandler.switchStage(event, "movie.fxml");
    }
}
