package com.telerikacademy.web.springdemo.repositories;

import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BeerRepositoryImpl implements BeerRepository {

    private final DbHelper dbHelper;

    @Autowired
    public BeerRepositoryImpl(DbHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    @Override
    public List<Beer> getAll() {
        String query = "select beer_id, name, abv " +
                "from beers";
        try (
                Connection connection = dbHelper.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)
        ) {
            return getBeers(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Beer getById(int id) {
        String query = "select beer_id, name, abv " +
                "from beers " +
                "where beer_id = ?";
        try (
                Connection connection = dbHelper.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                List<Beer> result = getBeers(resultSet);
                if (result.size() == 0) {
                    throw new EntityNotFoundException("Beer", id);
                }
                return result.get(0);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Beer getByName(String name) {
        String query = "select beer_id, name, abv " +
                "from beers " +
                "where name = ?";
        try (
                Connection connection = dbHelper.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setString(1, name);
            try (ResultSet resultSet = statement.executeQuery()) {
                List<Beer> result = getBeers(resultSet);
                if (result.size() == 0) {
                    throw new EntityNotFoundException("Beer", "name", name);
                }
                return result.get(0);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(Beer beer) {
        String query = "insert into beers (name, abv) " +
                "values (?, ?)";
        try (
                Connection connection = dbHelper.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setString(1, beer.getName());
            statement.setDouble(2, beer.getAbv());
            statement.executeUpdate();

            Beer newBeer = getByName(beer.getName());
            beer.setId(newBeer.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Beer beer) {
        String query = "update beers set " +
                "name = ?," +
                "abv = ?" +
                "where beer_id = ?";
        try (
                Connection connection = dbHelper.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setString(1, beer.getName());
            statement.setDouble(2, beer.getAbv());
            statement.setInt(3, beer.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        String query = "delete from beers " +
                "where beer_id = ?";
        try (
                Connection connection = dbHelper.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Beer> getBeers(ResultSet beersData) throws SQLException {
        List<Beer> beers = new ArrayList<>();
        while (beersData.next()) {
            Beer beer = new Beer(
                    beersData.getInt("beer_id"),
                    beersData.getString("name"),
                    beersData.getDouble("abv")
            );
            beers.add(beer);
        }
        return beers;
    }

}
