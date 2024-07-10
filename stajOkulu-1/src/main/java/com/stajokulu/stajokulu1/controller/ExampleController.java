package com.stajokulu.stajokulu1.controller;

import com.stajokulu.stajokulu1.service.exampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExampleController {

    private final exampleService ExampleService;

    public ExampleController(exampleService ExampleService) {
        this.ExampleService = ExampleService;
    }

    @GetMapping
    public String exampleMethod() {
        return "Success";
    }

    @GetMapping("/service")
    public String exampleMethodA() {
        return ExampleService.exampleServiceMethod();
    }
}