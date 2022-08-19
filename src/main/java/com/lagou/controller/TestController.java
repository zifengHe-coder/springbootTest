package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezifeng
 * @create 2022/8/19 17:17
 */
@RestController
@RequestMapping("/app")
public class TestController {
    @RequestMapping("/test")
    public String test() {
        System.out.println("---hello---");
        return "hello";
    }
}