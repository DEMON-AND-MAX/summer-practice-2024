package com.haufe.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class ReviewController implements Initializable {

    @FXML
    private TextArea textAreaReview;
    @FXML
    private Slider sliderRating;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void buttonPressedSend(ActionEvent event) {
        Review review = new Review(DataHandler.getInstance().currentUser,
                (int)sliderRating.getValue(),
                textAreaReview.getText());
        DataHandler.getInstance().selectedMovie.addReview(review);
        StageHandler.switchStage(event, "movie.fxml");
    }

    public void buttonPressedReturn(ActionEvent event) {
        StageHandler.switchStage(event, "movie.fxml");
    }
}
