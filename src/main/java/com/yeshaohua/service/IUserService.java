package com.yeshaohua.service;

import com.yeshaohua.model.User;

import java.util.List;

public interface IUserService {
    public User findUserById(int id);
    public void addUser(User user);
    public List<User> getAllUsers();
}