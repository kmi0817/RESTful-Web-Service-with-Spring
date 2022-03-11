package com.example.demo;

import java.until.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s"; // content field in greeting
    private final AtomicLong counter = new AtomicLong(); // id field in greeting

    @GetMapping("/greeting");
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        // return type: Greeting instance
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}