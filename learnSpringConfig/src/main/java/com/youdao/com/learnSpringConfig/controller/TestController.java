package com.youdao.com.learnSpringConfig.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping(value="/")
    public String hello(){
        return "Hello, form TestController class.";
    }




}
