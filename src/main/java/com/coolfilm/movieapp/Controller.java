package com.coolfilm.movieapp;

import com.coolfilm.movieapp.DAO.FilmDAO;
import com.coolfilm.movieapp.DAO.FilmFavouriteDAO;
import com.coolfilm.movieapp.entity.Film;
import com.coolfilm.movieapp.entity.FilmFavourite;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private final FilmDAO filmDAO = new FilmDAO();
    private final FilmFavouriteDAO favDAO = new FilmFavouriteDAO();

    @FXML
    private TableView<Film> filmTbl;
    @FXML
    private Button confirmButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button favsButton;

    @FXML
    private TableColumn<FilmFavourite, Film> favsCol;

    @FXML
    private TableView<FilmFavourite> filmFavTable;

    @FXML
    private TableColumn<Film, String> idCol;

    @FXML
    private TableColumn<Film, Double> ratingCol;

    @FXML
    private TableColumn<Film, String> titleCol;

    @FXML
    private TextField searchBar;

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
        ratingCol.setCellValueFactory(new PropertyValueFactory<Film, Double>("rating"));
        favsCol.setCellValueFactory(new PropertyValueFactory<FilmFavourite, Film>("film"));
        filmTbl.getItems().addAll(filmDAO.readAllAsList());

        filmFavTable.setItems(FXCollections.observableArrayList(favDAO.readAllAsList()));

    }

    @FXML
    public void searchFilmList(KeyEvent keyEvent) {


        List<Film> listOfFilms = filmDAO.searchFilmList(searchBar.getText());

        filmTbl.setItems(FXCollections.observableArrayList(listOfFilms));

    }

    @FXML
    public void addSelectedToFav(MouseEvent event) {



        Film filmFavourite = filmTbl.getSelectionModel().getSelectedItem();

        FilmFavourite filmFav = new FilmFavourite();

        filmFav.setFilm(filmFavourite);
        favDAO.create(filmFav);

        filmFavTable.setItems(FXCollections.observableArrayList(favDAO.readAllAsList()));



    }
}