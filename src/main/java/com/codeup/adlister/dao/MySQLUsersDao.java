package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import java.sql.*;

public class MySQLUsersDao implements Users{
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
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
    public String findByUsername(String username){
        String sql = "SELECT * FROM ymir_jeremy.adUsers WHERE password = ?";

        PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, user.getPassword());

        stmt.executeUpdate();

        ResultSet generatedIdResultSet = stmt.getGeneratedKeys();

        return users;

//        return null;
    }

    @Override
    public Long insert(User user) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(createInsertQuery(user), Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }

    }

    private String createInsertQuery(User user) throws SQLException {

        String sql = "INSERT INTO ymir_jeremy.adUsers(id, username, email, password) VALUES (?, ?, ?, ?)";

        PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setLong(1, user.getId());
        stmt.setString(2, user.getUsername());
        stmt.setString(3, user.getEmail());
        stmt.setString(4, user.getPassword());

        stmt.executeUpdate();

        ResultSet generatedIdResultSet = stmt.getGeneratedKeys();

        return String.valueOf(generatedIdResultSet);
    }

    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }
}
