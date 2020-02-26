package com.itheima.springboot0504.mapper;

import com.itheima.springboot0504.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User selectByName(String username);
    public void addUser(User user);
}
