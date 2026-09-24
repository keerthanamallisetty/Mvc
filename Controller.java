package com.example.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final GreetingService greetingService;

    public Controller(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/api/greet")
    public Model greet(@RequestParam(defaultValue = "") String name) {
        return new Model(greetingService.createGreeting(name));
    }
}
