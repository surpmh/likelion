package dao;

import domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStrategy implements StatementStrategy {
    private User user;

    public AddStrategy(User user) {
        this.user = user;
    }

    @Override
    public PreparedStatement makePreparedStatment(Connection connection) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?);");
        ps.setString(1, user.getId());
        ps.setString(1, user.getName());
        ps.setString(1, user.getPassword());

        return ps;
    }
}
