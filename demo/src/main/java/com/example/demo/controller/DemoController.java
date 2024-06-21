package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("demo")
@RefreshScope
public class DemoController {

    @Value("${testKey:123}")
    String testKey;
//    @RequestMapping("/testKey")
//    public String test() {
//        return key;
//    }
//
//
    @RequestMapping("/testKmsKey")
    public String testKmsKey() {
        return testKey;
    }
}
