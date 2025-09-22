package com.cts.springbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @RequestMapping
    public String sayHello() {
        return "Updated: Hello, Welcome to Spring Boot Application!";
    }

}
