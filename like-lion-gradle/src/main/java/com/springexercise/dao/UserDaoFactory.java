package com.springexercise.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {

    @Bean
    public UserDao userDao() {
        AWSConnectionMacker awsConnectionMacker = new AWSConnectionMacker();
        return new UserDao(awsConnectionMacker);
    }

}