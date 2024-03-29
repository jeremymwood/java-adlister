package com.codeup.adlister.dao;
import com.codeup.adlister.Util.Password;
import com.mysql.cj.jdbc.Driver;
import com.codeup.adlister.models.User;

import java.sql.*;

public class MySQLUsersDao implements Users{
    private Connection connection;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

@Override
public User findByUsername(String username) {
    String query = "SELECT * FROM ymir_jeremy.adUsers WHERE username = ? LIMIT 1";
    try {
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, username);
        return extractUser(stmt.executeQuery());
    } catch (SQLException e) {
        throw new RuntimeException("Error finding a user by username", e);
    }
}

    @Override
    public Long insert(User user) {
        try {
            String sql = "INSERT INTO adUsers(id, username, email, password) VALUES (?, ?, ?, ?) ";
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            String hashedPassword = Password.hash(user.getPassword());

            stmt.setLong(1, user.getId());
            stmt.setString(2, user.getUsername());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, hashedPassword);


            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }


    private User extractUser(ResultSet rs) throws SQLException {
        if (! rs.next()) {
            return null;
        }
        return new User(
            rs.getLong("id"),
            rs.getString("username"),
            rs.getString("email"),
            rs.getString("password")
        );
    }
}
