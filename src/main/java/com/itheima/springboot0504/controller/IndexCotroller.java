package com.itheima.springboot0504.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexCotroller {
    @RequestMapping("/")
    public String a(){
        return "redirect:/user/index";
    }
}
