package com.vigileye.rescuehub_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    public String hello() {
        return "RescueHub API is working!";
    }
}