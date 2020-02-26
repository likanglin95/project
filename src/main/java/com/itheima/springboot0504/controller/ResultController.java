package com.itheima.springboot0504.controller;

import com.itheima.springboot0504.domain.Result;
import com.itheima.springboot0504.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ResultService resultService;

    @RequestMapping("select")
    public String xinxilook(String id, Map<String, Object> map) {
        Result result = this.resultService.selectById(id);
        map.put("r", result);
        return "select";
    }

    @RequestMapping("/show")
    public String show(String id, Map<String, Object> map) {
    Result result = this.resultService.selectById(id);
    map.put("r",result);
    return "resultupdate";
    }

    @RequestMapping("/update")
    public String update(Result result){
        System.out.println(result.toString());
        this.resultService.update(result);
        return "/test/show";
    }
}
