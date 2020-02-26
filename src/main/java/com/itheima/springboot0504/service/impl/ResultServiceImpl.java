package com.itheima.springboot0504.service.impl;

import com.itheima.springboot0504.domain.Result;
import com.itheima.springboot0504.domain.Student;
import com.itheima.springboot0504.mapper.ResultMapper;
import com.itheima.springboot0504.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    private ResultMapper resultMapper;
    @Transactional
    @Override
    public void save(Student student) {
        this.resultMapper.save(student);
    }

    @Transactional
    @Override
    public Result selectById(String id) {
        Result result =  this.resultMapper.selectById(id);
        return result;
    }

    @Transactional
    @Override
    public Result selectAll() {
        Result result =  this.resultMapper.selectAll();
        return result;
    }

    @Transactional
    @Override
    public void update(Result result) {
        this.resultMapper.update(result);
    }

    @Transactional
    @Override
    public void deleteById(String id) {
        this.resultMapper.deleteById(id);

    }

    @Override
    public void updatename(Student student) {
        this.resultMapper.updatename(student);
    }

}
