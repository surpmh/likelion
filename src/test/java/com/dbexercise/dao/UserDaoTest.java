package com.dbexercise.dao;

import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        AWSUserDaoImpl userDao = new AWSUserDaoImpl();
        User user = new User();
        user.setId("2");
        user.setName("Ayeong");
        user.setPassword("123");
        userDao.add(user);

        User selectedUser = userDao.get(user.getId());
        Assertions.assertEquals("Ayeong", selectedUser.getName());
    }
}