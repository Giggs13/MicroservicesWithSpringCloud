package com.giggs13.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootWarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWarApplication.class, args);
    }

    @GetMapping("/")
    public String getGreetingMessage() {
        return "Hello from Spring Boot War Application";
    }
}
