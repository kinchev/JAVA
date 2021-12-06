package com.telerikacademy.interfacesegregation.examples.violation;

import com.telerikacademy.interfacesegregation.models.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepositoryImpl implements BaseRepository<Country> {

    /**
     * The countries are predefined and we do not need to be able to create or update them.
     * Still, we are forcing CountryRepositoryImpl to implement methods that it does not support.
     */


    private final SessionFactory sessionFactory;

    @Autowired
    public CountryRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Country country) {
        throw new UnsupportedOperationException("Creating a country not supported.");
    }

    @Override
    public List<Country> getAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<Country> query = session.createQuery("from Country", Country.class);
            return query.list();
        }
    }
}
