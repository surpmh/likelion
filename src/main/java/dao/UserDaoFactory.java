package dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {
    @Bean
    public UserDao awsUserDao() {
        UserDao userDao = new UserDao(new AWSConnectionMaker());
        return userDao;
    }
}
