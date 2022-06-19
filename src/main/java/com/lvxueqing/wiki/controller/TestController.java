package com.lvxueqing.wiki.controller;


import com.lvxueqing.wiki.domain.Test;
import com.lvxueqing.wiki.service.testService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Value("${test.Hello:MoRenZhi}")
    private String testHello;

    @Resource
    private testService testService;

//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello(){
        return "Hello world" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello world, i know your name: " + name;
    }


    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }



}
