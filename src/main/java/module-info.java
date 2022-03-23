module com.coolfilm.movieapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.coolfilm.movieapp to javafx.fxml;
    exports com.coolfilm.movieapp;
}