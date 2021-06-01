package com.example.main;

import com.example.main.manager.Manager;
import com.example.main.repository.FooRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Manager foo(FooRepository fooRepository) {
        return new Manager(fooRepository);
    }
}
