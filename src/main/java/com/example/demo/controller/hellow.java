package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@EnableAutoConfiguration
@ComponentScan
public class hellow {
    @Autowired
    private UserService userService;
    @RequestMapping("/userAll")
    public String lookAllUser(){
        List<User> users = userService.lookAll();
        System.out.println(users);
        return "userall";
    }
}
