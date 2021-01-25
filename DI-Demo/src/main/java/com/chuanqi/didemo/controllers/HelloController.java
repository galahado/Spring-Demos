package com.chuanqi.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
    public String sayHello() {
        return "Hello spring!";
    }
}
