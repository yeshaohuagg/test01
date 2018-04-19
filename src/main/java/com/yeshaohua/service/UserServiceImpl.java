package com.yeshaohua.service;

import com.yeshaohua.dao.IUserDao;
import com.yeshaohua.dao.UserDaoImp;
import com.yeshaohua.model.User;

import java.util.List;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImp();
    }

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
    public void addUser(User user){
        userDao.addUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}