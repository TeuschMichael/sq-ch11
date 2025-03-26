package com.example.sq_ch11_ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public RestTemplate rest(){
        return new RestTemplate();
    }
}
