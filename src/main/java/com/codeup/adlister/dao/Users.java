package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.sql.SQLException;

public interface Users {
    String findByUsername(String username);
    Long insert(User user);
}
