package com.itheima.springboot0504.mapper;

import com.itheima.springboot0504.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    public List<Student> selectAll();
    public int insertOne(Student student);
    public  int deleteFromId(String id);
    public Student selectOne(String id);
    public void updateById(Student student);
}
