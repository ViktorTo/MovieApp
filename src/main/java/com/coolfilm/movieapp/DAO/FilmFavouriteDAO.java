package com.coolfilm.movieapp.DAO;

import com.coolfilm.movieapp.entity.Film;
import com.coolfilm.movieapp.entity.FilmFavourite;
import com.coolfilm.movieapp.util.DatabaseSession;
import org.hibernate.Session;

import java.util.List;

public class FilmFavouriteDAO implements DataAccessObject<FilmFavourite>{

    private final DatabaseSession databaseSession = new DatabaseSession();

    @Override
    public FilmFavourite read(int id) {
        Session session = databaseSession.startSession();
        Film film = session.find(Film.class, id);
        databaseSession.endSession(session);
        return null;
    }

    @Override
    public void create(FilmFavourite data) {
        Session session = databaseSession.startSession();
        List<FilmFavourite> fav = session.createQuery("SELECT f FROM FilmFavourite f WHERE f.film.id = :id")
                .setParameter("id", data.getFilm().getId())
                .getResultList();
        System.out.println(readAllAsList().size());
        if(fav.size() == 0) {
            session.persist(data);
        }
        databaseSession.endSession(session);
    }

    @Override
    public void update(FilmFavourite data) {
        Session session = databaseSession.startSession();
        Film film = session.find(Film.class, data.getId());
        //film.setRating(data.getRating());
        //film.setTitle(data.getTitle());
        databaseSession.endSession(session);
    }

    @Override
    public void delete(int id) {
        Session session = databaseSession.startSession();
        FilmFavourite filmFavourite = session.find(FilmFavourite.class, id);
        session.remove(filmFavourite);
        databaseSession.endSession(session);
    }

    @Override
    public List<FilmFavourite> readAllAsList() {
        Session session = databaseSession.startSession();
        List<FilmFavourite> filmFavouriteList = session.createQuery("SELECT f FROM FilmFavourite f LEFT JOIN FETCH f.film" , FilmFavourite.class)
                .getResultList();
        databaseSession.endSession(session);
        return filmFavouriteList;
    }

}
