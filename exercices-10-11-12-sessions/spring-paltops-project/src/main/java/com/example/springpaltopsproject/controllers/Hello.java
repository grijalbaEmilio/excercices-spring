package com.example.springpaltopsproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/api/hiTest")
    public String hello(){
        return "Hello world, this is a test!";
    }
}
