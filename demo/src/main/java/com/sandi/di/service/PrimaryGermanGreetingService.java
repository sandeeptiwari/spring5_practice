package com.sandi.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"de", "default"})// if no other active profile available
public class PrimaryGermanGreetingService implements GreetingService {

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {

    }

    @Override
    public String sayGreeting() {
        return "Hi, I am from primary german greeting service";
    }
}
