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

    public void jdbcContextWithStatementStrategy(StatementStrategy st) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = connectionMaker.makeConnection();
            ps = st.makePreparedStatment(c);
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    public void add(User user) throws SQLException {
        jdbcContextWithStatementStrategy(new StatementStrategy() {
            @Override
            public PreparedStatement makePreparedStatment(Connection c) throws SQLException {
                PreparedStatement ps = c.prepareStatement("INSERT INTO users(id, name, password) VALUES (?, ?, ?)");
                ps.setString(1, user.getId());
                ps.setString(2, user.getName());
                ps.setString(3, user.getPassword());

                return ps;
            }
        });
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
        StatementStrategy st = (c) -> {
            return c.prepareStatement("SELECT COUNT(*) FROM users");
        };
        PreparedStatement ps = st.makePreparedStatment(connectionMaker.makeConnection());
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1);
    }

   public void deleteAll() throws SQLException {
       jdbcContextWithStatementStrategy(c -> c.prepareStatement("DELETE FROM users"));
   }
}
