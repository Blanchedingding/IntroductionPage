package dao;

import entity.User;

public interface UserDao {
    public User find(String userName, String password);
}
