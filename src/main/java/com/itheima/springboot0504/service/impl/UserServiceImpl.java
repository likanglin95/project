package com.itheima.springboot0504.service.impl;

import com.itheima.springboot0504.domain.User;
import com.itheima.springboot0504.mapper.UserMapper;
import com.itheima.springboot0504.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectByName(String username) {
       User user = this.userMapper.selectByName(username);
        return user;
    }
}
