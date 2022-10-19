package com.dbexercise.dao;

public class UserDaoFactory {
    public UserDao userDao() {
        DConnectionMaker dConnectionMaker = new DConnectionMaker();
        return new UserDao(dConnectionMaker);
    }
}
