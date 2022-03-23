module com.coolfilm.movieapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.persistence;
    requires java.sql;

    opens com.coolfilm.movieapp to javafx.fxml;
    opens com.coolfilm.movieapp.entity;
    exports com.coolfilm.movieapp;
}