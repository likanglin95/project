package com.itheima.springboot0504.service;

import com.itheima.springboot0504.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public List<Student> selectAll();

    public int insertOne(Student student);

    public int deleteFromId(String id);

    public Student selectOne(String id);

    public void updateById(Student student);
}
