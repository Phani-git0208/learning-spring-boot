package com.phain.springlerning.learningspringbootapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorld {

    @GetMapping("/")
    public String hello(){
        return "hello world from phani";
    }
}
