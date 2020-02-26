package com.itheima.springboot0504.controller;

import com.itheima.springboot0504.domain.User;
import com.itheima.springboot0504.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    public String login(String username, Map<String,Object> map){
        User user = this.userService.selectByName(username);
        if (user==null){
            map.put("err",1);
            return "login";
        }
        else{
            map.put("err",0);
            return "redirect:/test/show";
        }
    }

}
