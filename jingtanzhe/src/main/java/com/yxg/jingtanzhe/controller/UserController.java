package com.yxg.jingtanzhe.controller;

import com.yxg.jingtanzhe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String loginRequest(){
        return "hello";
    }
}
