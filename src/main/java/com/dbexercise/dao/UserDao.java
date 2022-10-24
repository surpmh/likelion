package com.dbexercise.dao;

import com.dbexercise.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class UserDao {
    private final JdbcTemplate jdbcTemplate;

    public UserDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    RowMapper<User> rowMapper = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            return user;
        }
    };

    public void deleteAll() throws SQLException {
        this.jdbcTemplate.update("DELETE FROM users");
    }

    public void add(final User user) throws SQLException {
        this.jdbcTemplate.update("INSERT INTO users(id, name, password) VALUES (?, ?, ?);", user.getId(), user.getName(), user.getPassword());
    }

    public int getCount() throws SQLException {
        return this.jdbcTemplate.queryForObject("SELECT COUNT(*) FROM users;", Integer.class);
    }

    public User findById(String id) throws SQLException {
        return this.jdbcTemplate.queryForObject("SELECT * FROM users WHERE id = ?", rowMapper, id);
    }

    public List<User> getAll() throws SQLException {
        return this.jdbcTemplate.query("SELECT * FROM users order by id", rowMapper);
    }
}
