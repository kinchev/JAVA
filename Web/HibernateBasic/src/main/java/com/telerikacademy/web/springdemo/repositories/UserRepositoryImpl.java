package com.telerikacademy.web.springdemo.repositories;

import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final DbHelper dbHelper;

    @Autowired
    public UserRepositoryImpl(DbHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    @Override
    public List<User> getAll() {
        String query = "select user_id, first_name, last_name, email " +
                "from users";
        try (
                Connection connection = dbHelper.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)
        ) {
            return getUsers(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User getById(int id) {
        String query = "select user_id, first_name, last_name, email " +
                "from users " +
                "where user_id = ?";
        try (
                Connection connection = dbHelper.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                List<User> result = getUsers(resultSet);
                if (result.size() == 0) {
                    throw new EntityNotFoundException("User", id);
                }
                return result.get(0);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User getByEmail(String email) {
        String query = "select user_id, first_name, last_name, email " +
                "from users " +
                "where email = ?";
        try (
                Connection connection = dbHelper.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setString(1, email);
            try (ResultSet resultSet = statement.executeQuery()) {
                List<User> result = getUsers(resultSet);
                if (result.size() == 0) {
                    throw new EntityNotFoundException("User", "email", email);
                }
                return result.get(0);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(User user) {
        String query = "insert into users (first_name, last_name, email) " +
                "values (?, ?, ?)";
        try (
                Connection connection = dbHelper.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setString(1, user.getFirstName());
            statement.setString(1, user.getLastName());
            statement.setString(1, user.getEmail());
            statement.executeUpdate();

            User newUser = getByEmail(user.getEmail());
            user.setId(newUser.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(User user) {
        String query = "update users set " +
                "first_name = ?," +
                "last_name = ?," +
                "email = ?" +
                "where user_id = ?";
        try (
                Connection connection = dbHelper.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setInt(4, user.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        String query = "delete from users " +
                "where user_id = ?";
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

    private List<User> getUsers(ResultSet usersData) throws SQLException {
        List<User> users = new ArrayList<>();
        while (usersData.next()) {
            User user = new User(
                    usersData.getInt("user_id"),
                    usersData.getString("first_name"),
                    usersData.getString("last_name"),
                    usersData.getString("email")
            );
            users.add(user);
        }
        return users;
    }

}
