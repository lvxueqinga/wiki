package com.lvxueqing.wiki.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TestController {

    @Value("${test.Hello:MoRenZhi}")
    private String testHello;

//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello(){
        return "Hello world" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello world, i know your name: " + name;
    }


}
