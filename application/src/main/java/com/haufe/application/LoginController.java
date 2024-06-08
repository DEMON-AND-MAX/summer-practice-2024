package com.haufe.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {
    @FXML
    private TextField textFieldUsername;
    @FXML
    private TextField textFieldPassword;
    @FXML
    private Button buttonLogin;

    public void buttonPressLogin(ActionEvent event) {
        String username = textFieldUsername.getText();
        String password = textFieldPassword.getText();
        // remove hardwired login replace with login manager
        //if(Objects.equals(username, "Max") && Objects.equals(password, "123")) {
            DataHandler.getInstance().currentUser = new User(1, username,
                    DatabaseHandler.getInstance().retrieveUserCatalogue(1),
                    DatabaseHandler.getInstance().retrieveFriendlist(1),
                    DatabaseHandler.getInstance().retrieveGroupList(1));
            StageHandler.switchStage(event, "catalogue.fxml");
        //}
    }
}