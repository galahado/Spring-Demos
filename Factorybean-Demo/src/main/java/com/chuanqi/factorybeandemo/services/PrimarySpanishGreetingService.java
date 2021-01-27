package com.chuanqi.factorybeandemo.services;

public class PrimarySpanishGreetingService implements GreetingService {
    private final GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String greeting() {
        return this.greetingRepository.getSpanishGreeting();
    }
}
