package com.chuanqi.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello Spring, using setter!";
    }
}
