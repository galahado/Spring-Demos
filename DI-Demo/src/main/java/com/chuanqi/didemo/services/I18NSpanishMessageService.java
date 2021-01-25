package com.chuanqi.didemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18NSpanishMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hola Mundo, ES!";
    }
}
