module com.coolfilm.movieapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires java.naming;

    opens com.coolfilm.movieapp to javafx.fxml;
    exports com.coolfilm.movieapp;
}