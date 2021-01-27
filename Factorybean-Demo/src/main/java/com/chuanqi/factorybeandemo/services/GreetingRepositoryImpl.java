package com.chuanqi.factorybeandemo.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - English";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hello - Spanish";
    }

    @Override
    public String getGermanGreeting() {
        return "Hello - German";
    }
}
