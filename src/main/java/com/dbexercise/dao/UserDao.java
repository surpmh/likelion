package com.dbexercise.dao;

import com.dbexercise.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        PreparedStatement ps = c.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        ps.setString(1, "1");
        ps.setString(2, "Ayeong");
        ps.setString(3, "1234");

        int status = ps.executeUpdate();
        ps.close();
        c.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(dbHost, dbUser, dbPassword);
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

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add();
        User user = userDao.get("2");
        System.out.println(user.getName());
    }
}
