package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserDao userDao;

    public int login(String userName,String password){
        return userDao.find(userName, password) == null? 0 : 1;
    }
}

