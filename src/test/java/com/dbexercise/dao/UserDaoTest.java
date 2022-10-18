package com.dbexercise.dao;

import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setId("1");
        user.setName("Ayeong");
        user.setPassword("123");
        userDao.add(user);

        User selectedUser = userDao.get(user.getId());
        Assertions.assertEquals("Ayeong", selectedUser.getName());
    }
}