package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot Docker App!";
    }

    @PostConstruct
    public void init() {
        log.info("Java app started");
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}