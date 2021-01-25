package com.chuanqi.didemo.controllers;

import com.chuanqi.didemo.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjController {
    private MessageService messageService;

    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public String greeting() {
        return messageService.getMessage();
    }
}
