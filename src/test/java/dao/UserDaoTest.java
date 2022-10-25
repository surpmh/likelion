package dao;

import domain.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    void addAndGet() throws SQLException {
        UserDao userDao = new UserDaoFactory().awsUserDao();
        String id = "1";
        User user1 = new User(id, "name", "1234");
        userDao.add(user1);

        User user2 = userDao.findById(id);
        assertEquals("name", user2.getName());
        assertEquals("1234", user2.getPassword());
    }
}