package com.diospring.diospringsantander.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HelloController {

    @GetMapping
    public String Hello() {
        return "Hello World";
    }
}
