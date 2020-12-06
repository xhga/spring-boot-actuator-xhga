package com.xhga.spring.actuator.client.config;

import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootAdminConfig {
    @Bean
    public InMemoryHttpTraceRepository getInMemoryHttpTrace(){
        return new InMemoryHttpTraceRepository();
    }
}
