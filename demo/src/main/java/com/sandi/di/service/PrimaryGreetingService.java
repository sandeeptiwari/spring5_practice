package com.sandi.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryGreetingService implements GreetingService {

    public PrimaryGreetingService(GreetingRepository greetingRepository) {

    }

    @Override
    public String sayGreeting() {
        return "Hi, This is primarygreetingservice - english";
    }
}
