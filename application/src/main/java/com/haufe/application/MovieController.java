package com.haufe.application;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import javax.net.ssl.SSLEngine;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MovieController implements Initializable {

    @FXML
    private Text textMovieInfo;
    @FXML
    private Button buttonReview;
    @FXML
    private VBox vBoxReviews;
    @FXML
    private ImageView imageViewCover;

    private Movie movie;
    private ArrayList<Review> reviews;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //vBoxReviews.widthProperty().addListener(e -> vBoxWidth = vBoxReviews.getWidth());
        movie = DataHandler.getInstance().selectedMovie;
        textMovieInfo.setText(movie.getName() + "\n" +
                movie.getDesc());
        vBoxReviews.getChildren().clear();
        if(movie.getReviews()!=null) {
            for(Review review : movie.getReviews()) {
                Text text = new Text();
                //text.wrappingWidthProperty().bind();
                text.setText(review.getUser().getUsername() + "\n" +
                        review.getRating() + "\n" +
                        review.getDesc());
                vBoxReviews.getChildren().add(text);
            }
        }
        Image image = new Image(movie.getImageLink());
        imageViewCover.setImage(image);
    }

    public void buttonPressedReview(ActionEvent event) {
        StageHandler.switchStage(event, "review.fxml");
    }

    public void buttonPressedReturn(ActionEvent event) {
        StageHandler.switchStage(event, "catalogue.fxml");
    }

    public void buttonPressedRecommend(ActionEvent event) {
        StageHandler.switchStage(event, "recommend.fxml");
    }
}
