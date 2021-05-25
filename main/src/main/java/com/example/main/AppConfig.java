package com.example.main;

import com.example.main.manager.Manager;
import com.example.main.repository.FooRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AppConfig {

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public Manager foo(FooRepository fooRepository) {
        return new Manager(fooRepository);
    }
}
