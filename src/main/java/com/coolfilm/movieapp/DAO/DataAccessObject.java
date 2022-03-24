package com.coolfilm.movieapp.DAO;

import java.util.List;

public interface DataAccessObject<T> {

    T read(int id);

    void create(T data);

    void update(T data);

    void delete(int id);

    List<T> readAllAsList();

}
