package com.chuanqi.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello Spring, using constructor!";
    }
}
