package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }

    public static void main(String[] args) {
        Users doa = DaoFactory.getUsersDao();
        System.out.println(doa.findByUsername("jeremy").getEmail());
        System.out.println(doa.findByUsername("jeremy").getPassword());
        System.out.println(doa.findByUsername("jeremy").getId());
    }
}
