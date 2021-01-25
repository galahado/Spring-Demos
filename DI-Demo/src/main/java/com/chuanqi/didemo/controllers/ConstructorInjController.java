package com.chuanqi.didemo.controllers;

import com.chuanqi.didemo.services.MessageService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjController {
    private final MessageService messageService;

    public ConstructorInjController(MessageService messageService) {
        this.messageService = messageService;
    }

    public String greeting() {
        return messageService.getMessage();
    }
}
