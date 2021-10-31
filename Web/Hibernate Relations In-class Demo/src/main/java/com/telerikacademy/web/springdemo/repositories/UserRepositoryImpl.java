package com.telerikacademy.web.springdemo.repositories;

import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> getAll() {
        try (Session session = sessionFactory.openSession()) {
            return session
                    .createQuery("from User", User.class)
                    .list();
        }
    }


    public List<User> getAllUserByCountry(String countryName) {
        try (Session session = sessionFactory.openSession()) {
            Query<User> query = session.createQuery("from User where User.adress.city.country.name = :countryName", User.class);
            query.setParameter("countryName", countryName);
            return query.list();
        }
    }

    @Override
    public User getById(int id) {
        try (Session session = sessionFactory.openSession()) {
            User user = session.get(User.class, id);
            if (user == null) {
                throw new EntityNotFoundException("User", id);
            }
            return user;
        }
    }



}
