package com.sandi.di.config;

import com.sandi.di.model.DummyDataSource;
import com.sandi.di.model.DummyJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class PropertyConfiguration {
    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Value("${sandi.jms.username}")
    String jmsUser;

    @Value("${sandi.jms.pass}")
    String jmsPass;

    @Value("${sandi.jms.url}")
    String jmsUrl;

    @Bean
    public DummyJmsBroker dummyJmsBroker(){
        DummyJmsBroker dummyJmsBroker = new DummyJmsBroker();
        dummyJmsBroker.setUser(jmsUser);
        dummyJmsBroker.setPass(jmsPass);
        dummyJmsBroker.setUrl(jmsUrl);
        return dummyJmsBroker;
    }

    @Bean
    public DummyDataSource dummyDataSource(){
        DummyDataSource dummyDataSource = new DummyDataSource();
        dummyDataSource.setUserName(user);
        dummyDataSource.setPassword(password);
        dummyDataSource.setUrl(url);
        return dummyDataSource;
    }

   /* @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =new PropertySourcesPlaceholderConfigurer();
        return  propertySourcesPlaceholderConfigurer;
    }*/
}
