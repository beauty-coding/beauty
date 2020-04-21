package com.beauty.mall.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Hello {

    @GetMapping("/sayhello")
    public String SayHello(){
        System.out.println("Hello World");
        return "Hello World";
    }



}
