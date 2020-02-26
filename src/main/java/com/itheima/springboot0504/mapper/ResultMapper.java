package com.itheima.springboot0504.mapper;

import com.itheima.springboot0504.domain.Result;
import com.itheima.springboot0504.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResultMapper {
    public Result selectById(String id);
    public void save(Student student);
    public void update(Result result);
    public Result selectAll();
    public void deleteById(String id);
    public void updatename(Student student);
}
