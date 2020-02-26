package com.itheima.springboot0504.controller;

import com.itheima.springboot0504.domain.Student;
import com.itheima.springboot0504.service.ResultService;
import com.itheima.springboot0504.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/test")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ResultService resultService;

    @RequestMapping("/show")
    public String show(Map<String,Object> map){
        map.put("show",studentService.selectAll());
        return "show";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }


    @RequestMapping("/save")
    public String save(Student student){
        System.out.println(student.getId());
        this.studentService.insertOne(student);
        this.resultService.save(student);
        return "redirect:/test/show";
    }

    @RequestMapping("/delete")
    public String delete(String id){
        studentService.deleteFromId(id);
        this.resultService.deleteById(id);
        return "redirect:/test/show";
    }

    @RequestMapping("/init")
    public String init(String id ,Map<String ,Object> map){
    map.put("s",this.studentService.selectOne(id));
    return "update";
    }
    @RequestMapping("/update")
    public String update(Student student){
        this.studentService.updateById(student);
        this.resultService.updatename(student);
        return "redirect:/test/show";
    }
}
