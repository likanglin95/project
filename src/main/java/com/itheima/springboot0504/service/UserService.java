package com.itheima.springboot0504.service;

import com.itheima.springboot0504.domain.User;

public interface UserService {
    public User selectByName(String username);
    public void addUser(User user);
}
