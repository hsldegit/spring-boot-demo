package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
    
    @Value("${username123}")
    private String username;
    
    
    
    @RequestMapping("/hello")
    public String hello(ModelMap map){
        map.put("username", username);
        return "helloworld";
    }
    
    
    
    
    
    
    
    
    
}
