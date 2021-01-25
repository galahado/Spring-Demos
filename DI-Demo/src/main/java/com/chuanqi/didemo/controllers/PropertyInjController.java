package com.chuanqi.didemo.controllers;

import com.chuanqi.didemo.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjController {

    @Autowired
    private MessageService msgService;

    public String greeting() {
        return msgService.getMessage();
    }
}
