package com.haufe.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewFriendGroupController implements Initializable {

    private FriendGroup selectedFriendGroup;
    @FXML
    private VBox vBoxRecommendation;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectedFriendGroup = DataHandler.getInstance().selectedFriendGroup;
        for(Recommendation recommendation : selectedFriendGroup.getRecommendations()) {
            Text text = new Text();
            text.setText(recommendation.getUser().getUsername() + "\n" +
                    recommendation.getMovie().getName() + "\n" +
                    recommendation.getComment());
            vBoxRecommendation.getChildren().add(text);
        }
    }

    public void buttonPressedReturn(ActionEvent event) {
        StageHandler.switchStage(event, "friendGroups.fxml");
    }
}
