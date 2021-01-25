package com.chuanqi.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hello Spring, using primary service!";
    }
}
