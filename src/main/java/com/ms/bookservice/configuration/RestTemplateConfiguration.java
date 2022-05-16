package com.ms.bookservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    public org.springframework.web.client.RestTemplate getRestTemplate(){
        return new org.springframework.web.client.RestTemplate();
    }
}
