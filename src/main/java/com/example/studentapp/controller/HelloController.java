package com.example.studentapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// 👇 this tells Spring that this class will handle web (HTTP) requests

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Ayush! your spring boot app is working perfectly";
    }
}
