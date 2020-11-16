package com.flyzone.fly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String hello(){
        return "/index";
    }
    @GetMapping("/user/reg.html")
    public String reg(){
        return "/user/reg";
    }


}
