package com.chuanqi.factorybeandemo.controllers;

import com.chuanqi.factorybeandemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting() {
        return this.greetingService.greeting();
    }
}
