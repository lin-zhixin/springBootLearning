package com.lzx.myservice.controller;

import com.lzx.myservice.aop.LogAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/aopTest")
    @LogAnnotation(moduleName = "AOP测试", operation = "test")
    public String aopTest() {
        System.out.println("aopTestRest");
        return "aopTestRest";
    }

    @GetMapping("intercepterTest")
    public String intercepterTest() {
        System.out.println("进入intercepterTest");
        return "intercepterTest";

    }

    @GetMapping("excludePathPattern")
    public String excludePathPattern() {
        System.out.println("进入excludePathPattern");
        return "excludePathPattern";

    }
}
