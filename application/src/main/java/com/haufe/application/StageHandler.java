package com.haufe.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StageHandler {
    public static void switchStage(ActionEvent event, String stagePath) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(stagePath));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = getStage(event);
            stage.setScene(scene);
            stage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static Stage getStage(ActionEvent e) {
        return (Stage)((Node)e.getSource()).getScene().getWindow();
    }
}
