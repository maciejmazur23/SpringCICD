package com.example.springcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    public static String CONTENT = "Привет, мир!";

    @GetMapping("/hello")
    public String getHelloWorld() {
        return CONTENT;
    }
}
