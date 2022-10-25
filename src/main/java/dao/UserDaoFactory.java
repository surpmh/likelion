package dao;

public class UserDaoFactory {
    public UserDao awsUserDao() {
        UserDao userDao = new UserDao(new AWSConnectionMaker());
        return userDao;
    }
}
