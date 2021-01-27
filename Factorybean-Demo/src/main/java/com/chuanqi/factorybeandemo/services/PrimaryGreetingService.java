package com.chuanqi.factorybeandemo.services;

public class PrimaryGreetingService implements GreetingService {
    private final GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String greeting() {
        return this.greetingRepository.getEnglishGreeting();
    }
}
