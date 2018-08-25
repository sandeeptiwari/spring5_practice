package com.sandi.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi, di I am getter injection";
    }
}
