package com.telerikacademy.interfacesegregation.examples.solution;

import com.telerikacademy.interfacesegregation.models.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    /**
     * By splitting up the BaseRepository interface into separate interfaces
     * we are no longer forcing CountryRepositoryImpl to provide implementation
     * for methods it shouldn't support.
     */

    private final SessionFactory sessionFactory;

    @Autowired
    public CountryRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Country> getAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<Country> query = session.createQuery("from Country", Country.class);
            return query.list();
        }
    }
}
