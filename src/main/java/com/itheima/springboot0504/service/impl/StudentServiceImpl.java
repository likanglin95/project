package com.itheima.springboot0504.service.impl;

import com.itheima.springboot0504.domain.Student;
import com.itheima.springboot0504.mapper.StudentMapper;
import com.itheima.springboot0504.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
    @Transactional
    @Override
    public int insertOne(Student student) {
        int i = studentMapper.insertOne(student);
        System.out.println("插入数据返回的int类型为"+i);
        return i;
    }

    @Transactional
    @Override
    public int deleteFromId(String id) {
       int i = this.studentMapper.deleteFromId(id);
       System.out.println(i);
        return i;
    }


    @Transactional
    @Override
    public Student selectOne(String id) {
        return this.studentMapper.selectOne(id);
    }

    @Transactional
    @Override
    public void updateById(Student student) {
        this.studentMapper.updateById(student);
    }


}
