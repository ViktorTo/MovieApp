package com.coolfilm.movieapp.DAO;

import com.coolfilm.movieapp.entity.Film;
import com.coolfilm.movieapp.util.DatabaseSession;
import org.hibernate.Session;

import java.util.List;

public class FilmDAO implements DataAccessObject<Film>{

    private final DatabaseSession databaseSession = new DatabaseSession();

    @Override
    public Film read(int id) {
        Session session = databaseSession.startSession();
        Film film = session.find(Film.class, id);
        databaseSession.endSession(session);
        return film;
    }

    @Override
    public void create(Film data) {
        Session session = databaseSession.startSession();
        session.persist(data);
        databaseSession.endSession(session);
    }

    @Override
    public void update(Film data) {
        Session session = databaseSession.startSession();
        Film film = session.find(Film.class, data.getId());
        film.setRating(data.getRating());
        film.setTitle(data.getTitle());
        databaseSession.endSession(session);
    }

    @Override
    public void delete(int id) {
        Session session = databaseSession.startSession();
        Film film = session.find(Film.class, id);
        session.remove(film);
        databaseSession.endSession(session);
    }

    @Override
    public List<Film> readAllAsList() {
        Session session = databaseSession.startSession();
        List<Film> filmList = session.createQuery("SELECT f FROM Film f" , Film.class)
                .getResultList();
        databaseSession.endSession(session);
        return filmList;
    }
}
