package com.sk.pfm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PfmApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfmApplication.class, args);
    }

    @GetMapping("/greet")
    public String helloGreeting() {
        return "Hello REST";
    }

}
