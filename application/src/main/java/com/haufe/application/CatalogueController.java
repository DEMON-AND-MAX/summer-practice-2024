package com.haufe.application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class CatalogueController implements Initializable {

    @FXML
    private ListView<String> listViewMedia;
    @FXML
    private Button buttonViewMovie;
    @FXML
    private Text textUsername;

    private Catalogue catalogue;
    private Movie selectedMovie;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        catalogue = null;
        catalogue = DatabaseHandler.getInstance().retrieveCatalogue();
        listViewMedia.getItems().clear();
        for(Movie movie : catalogue.getCatalogue()) {
            listViewMedia.getItems().add(movie.getName());
        }
        listViewMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                selectedMovie = catalogue.getMovieByName(listViewMedia.getSelectionModel().getSelectedItem());
                DataHandler.getInstance().selectedMovie = selectedMovie;
            }
        });
        textUsername.setText(DataHandler.getInstance().currentUser.getUsername());
    }

    public void buttonPressedViewMovie(ActionEvent event) {
        if(selectedMovie != null) {
            StageHandler.switchStage(event, "movie.fxml");
        }
    }

    public void buttonPressedFriends(ActionEvent event) {
        StageHandler.switchStage(event, "friendList.fxml");
    }

    public void buttonPressedGroups(ActionEvent event) {
        StageHandler.switchStage(event, "friendGroups.fxml");
    }
}
