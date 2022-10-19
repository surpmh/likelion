package com.dbexercise.dao;

import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
       UserDao userDao = new UserDao(new DConnectionMaker());
       String id = "1";
       userDao.add(new User("1", "Ayeong", "1234"));

       User user = userDao.findById(id);
        Assertions.assertEquals("Ayeong", user.getName());
    }
}