package com.example.mvc;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String createGreeting(String name) {
        if (name == null || name.isBlank()) {
            return "Please enter your name.";
        }

        return "Hello " + name.trim() + "!";
    }
}
