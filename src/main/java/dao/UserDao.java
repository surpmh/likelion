package dao;

import java.sql.Connection;
import domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private ConnectionMaker connectionMaker;

    public UserDao(AWSConnectionMaker awsConnectionMaker) {
        this.connectionMaker = new AWSConnectionMaker();
    }

    public void add(User user) throws SQLException {
        Connection c = connectionMaker.makeConnection();
        PreparedStatement ps = c.prepareStatement("INSERT INTO users(id, name, password) VALUES (?, ?, ?)");

        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public User findById(String id) throws SQLException {
        Connection c = connectionMaker.makeConnection();
        PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        User user = null;
        if(rs.next()) {
            user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
        } else {
            throw new EmptyResultDataAccessException(1);
        }

        rs.close();
        ps.close();
        c.close();

        return user;
    }

    public int getCount() throws SQLException {
        Connection c = connectionMaker.makeConnection();
        PreparedStatement ps = c.prepareStatement("SELECT COUNT(*) FROM users");

        ResultSet rs = ps.executeQuery();

        rs.next();

        int count = rs.getInt(1);

        ps.close();
        c.close();

        return count;
    }

   public void deleteAll() throws SQLException {
       Connection c = connectionMaker.makeConnection();
       PreparedStatement ps = c.prepareStatement("DELETE FROM users");

       ps.executeUpdate();

       ps.close();
       c.close();
   }
}
