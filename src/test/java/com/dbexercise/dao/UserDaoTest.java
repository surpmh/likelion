package com.dbexercise.dao;

import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
    @Autowired
    ApplicationContext context;

    @Test
    void testName() throws SQLException, ClassNotFoundException {
       UserDao userDao = context.getBean("userDao", UserDao.class);
       String id = "1";
       userDao.add(new User(id, "Ayeong", "1234"));

       User user = userDao.findById(id);
       Assertions.assertEquals("Ayeong", user.getName());
    }
}