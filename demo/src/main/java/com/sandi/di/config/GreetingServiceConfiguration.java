package com.sandi.di.config;

import com.sandi.di.service.GreetingRepository;
import com.sandi.di.service.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfiguration {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return  new GreetingServiceFactory(greetingRepository);
    }
}
