package com.example.demo;

import com.ace.cache.EnableAceCache;
import com.example.demo.config.GlobalErrorView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAceCache
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean("error")
    public GlobalErrorView error() {
        return new GlobalErrorView();
    }
}
