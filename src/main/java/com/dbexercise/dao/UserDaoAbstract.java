package com.dbexercise.dao;

import com.dbexercise.domain.User;

import java.sql.*;

public abstract class UserDaoAbstract {
    public abstract Connection makeConnection() throws ClassNotFoundException, SQLException;

    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection c = makeConnection();
        PreparedStatement ps = c.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();
        c.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection c = makeConnection();
        PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id = ?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));
        rs.close();
        ps.close();
        c.close();
        return user;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        AWSUserDaoImpl userDao = new AWSUserDaoImpl();

        User user = new User();
        user.setId("4");
        user.setName("Ayeong");
        user.setPassword("123");
        userDao.add(user);

        User user2 = userDao.get(user.getId());
        System.out.println(user2.getName());
    }
}
