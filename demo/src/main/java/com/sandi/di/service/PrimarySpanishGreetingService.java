package com.sandi.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService{

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {

    }

    @Override
    public String sayGreeting() {
        return "Hi, This is spanish greeting service";
    }
}
