package com.itheima.springboot0504.service;

import com.itheima.springboot0504.domain.Result;
import com.itheima.springboot0504.domain.Student;
import com.itheima.springboot0504.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface ResultService {
    public void save(Student student);
    public Result selectById(String id);
    public Result selectAll();
    public void update(Result result);
    public void deleteById(String id);
    public void updatename(Student student);
}
