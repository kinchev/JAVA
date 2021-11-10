package com.telerikacademy.web.springdemo.repositories;

import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.models.BeerDto;
import com.telerikacademy.web.springdemo.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BeerRepositoryImpl implements BeerRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public BeerRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Beer> getAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<Beer> query = session.createQuery("from Beer", Beer.class);
            return query.list();
        }
    }

    @Override
    public List<Beer> filter(Optional<Integer> styleId) {
        try (Session session = sessionFactory.openSession()) {
            Query<Beer> query = session.createQuery("from Beer where style.id = :styleId", Beer.class);
            query.setParameter("styleId", styleId.orElse(0));
            return query.list();
        }
    }

    @Override
    public Beer getById(int id) {
        try (Session session = sessionFactory.openSession()) {
            Beer beer = session.get(Beer.class, id);
            if (beer == null) {
                throw new EntityNotFoundException("Beer", id);
            }
            return beer;
        }
    }

    @Override
    public Beer getByName(String name) {
        try (Session session = sessionFactory.openSession()) {
            Query<Beer> query = session.createQuery("from Beer where name = :name", Beer.class);
            query.setParameter("name", name);

            List<Beer> result = query.list();
            if (result.size() == 0) {
                throw new EntityNotFoundException("Beer", "name", name);
            }

            return result.get(0);
        }
    }

    @Override
    public void create(Beer beer) {
        try (Session session = sessionFactory.openSession()) {
            BeerDto dto = new BeerDto();
            session.save(beer);
        }
    }

    @Override
    public void update(Beer beer) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(beer);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(int id) {
        Beer beerToDelete = getById(id);
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(beerToDelete);
            session.getTransaction().commit();
        }
    }


}

