package com.sandi.di;

import com.sandi.di.controller.ConstructorInjectedController;
import com.sandi.di.controller.GetterInjectedController;
import com.sandi.di.controller.MyController;
import com.sandi.di.controller.PropertyInjectedController;
import com.sandi.di.service.ConstructorGreetingService;
import com.sandi.di.service.GetterGreetingService;
import com.sandi.di.service.GreetingService;
import com.sandi.di.service.PrimarySpanishGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        System.out.println(ctx.getBean(MyController.class).hello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
    }
}
