package com.sandi.di.controller;

import com.sandi.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
   // @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;//greetingServiceImpl;

    public String sayHello(){
        return greetingService.sayGreeting();//greetingServiceImpl.sayGreeting();
    }
}
