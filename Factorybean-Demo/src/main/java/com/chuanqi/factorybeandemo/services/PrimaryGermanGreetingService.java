package com.chuanqi.factorybeandemo.services;

public class PrimaryGermanGreetingService implements GreetingService {
    private final GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    @Override
    public String greeting() {
        return this.greetingRepository.getGermanGreeting();
    }
}
