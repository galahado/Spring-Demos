package com.chuanqi.didemo.controllers;

import com.chuanqi.didemo.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjController {

    @Qualifier("propertyMessageService")
    @Autowired
    private MessageService msgService;

    public String greeting() {
        return msgService.getMessage();
    }
}
