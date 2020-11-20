package com.flyzone.fly.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String hello(){
        return "index";
    }
    @GetMapping("/user/reg")
    public String reg(){
        return "/user/reg";
    }
    @PostMapping("reg")
    public String regIn( Model model){

        return "redirect:/user/login";
    }
    @GetMapping("/user/login")
    public String sinGo(){
        return "/user/login";
    }
}
