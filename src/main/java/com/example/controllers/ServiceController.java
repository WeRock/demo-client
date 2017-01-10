package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by smahanty on 1/9/17.
 */
@RestController
public class ServiceController {
    @RequestMapping("/resource")
    public Map<String, String> home() {
        Map<String, String> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World!");
        return model;
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
