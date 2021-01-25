package com.chuanqi.didemo.controllers;

import com.chuanqi.didemo.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    private final MessageService messageService;

    public I18NController(@Qualifier("i18nService") MessageService messageService) {
        this.messageService = messageService;
    }

    public String greeting() {
        return messageService.getMessage();
    }
}
