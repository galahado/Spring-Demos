package com.chuanqi.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello Spring, using property!";
    }
}
