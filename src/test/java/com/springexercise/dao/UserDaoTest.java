package com.springexercise.dao;

import com.dbexercise.dao.UserDao;
import com.dbexercise.dao.UserDaoFactory;
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
        String id = "2";
        userDao.add(new User(id, "name", "1234"));

        User user = userDao.findById(id);
        Assertions.assertEquals("name", user.getName());
    }
}