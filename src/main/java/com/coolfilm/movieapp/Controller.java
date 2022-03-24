package com.coolfilm.movieapp;

import com.coolfilm.movieapp.DAO.FilmDAO;
import com.coolfilm.movieapp.entity.Film;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TableView<Film> filmTbl;
    @FXML
    private Button confirmButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button favsButton;

    @FXML
    private TableColumn<?, ?> favsCol;

    @FXML
    private TableColumn<Film, String> idCol;

    @FXML
    private TableColumn<Film, Integer> ratingCol;

    @FXML
    private TableColumn<Film, String> titleCol;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FilmDAO filmDAO = new FilmDAO();
        idCol.setCellValueFactory(new PropertyValueFactory<Film, String>("id"));
        titleCol.setCellValueFactory(new PropertyValueFactory<Film, String>("title"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<Film, Integer>("rating"));
        filmTbl.getItems().addAll(filmDAO.readAllAsList());

    }
}