package com.flyzone.fly.controller;

import com.flyzone.fly.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    //注册页面
    @GetMapping("/reg")
    public String reg(){
        return "/user/reg";
    }

    //用户注册
    @PostMapping("/add")
    public String add(User user ){
        System.out.println(user.getUsername());

        return "redirect:/login";
    }

    //登录页面
    @GetMapping("/login")
    public String sinGo(){

        return "/user/login";
    }
}
