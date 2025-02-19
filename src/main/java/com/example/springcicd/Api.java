package com.example.springcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Api {
    public static final String CONTENT = "Привет, мир!";
    public static final String ENDPOINT = "/";

    @GetMapping(value = Api.ENDPOINT)
    public String getHelloWorld() {
        return CONTENT;
    }
}
