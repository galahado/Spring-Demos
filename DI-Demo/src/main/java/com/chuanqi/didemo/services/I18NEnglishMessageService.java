package com.chuanqi.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18NEnglishMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello Spring, EN!";
    }
}
