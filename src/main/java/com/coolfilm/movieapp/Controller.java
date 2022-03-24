package com.coolfilm.movieapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

import java.io.IOException;

public class Controller {
    @FXML
    private Button confirmButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button favsButton;

    @FXML
    private TableColumn<?, ?> favsCol;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private TableColumn<?, ?> ratingCol;

    @FXML
    private TableColumn<?, ?> titleCol;

    @FXML
    public void handleAction(ActionEvent event) throws IOException {

        if (event.getSource() == favsButton){

            //kod för favourite button

        }
        if (event.getSource() == deleteButton) {

            //kod för delete button

        }
        if(event.getSource() == confirmButton) {

            //kod för confirm button

        }

    }
}