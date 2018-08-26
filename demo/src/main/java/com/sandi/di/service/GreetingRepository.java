package com.sandi.di.service;

import org.springframework.stereotype.Repository;

public interface GreetingRepository {
    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}
