package com.example.greetingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public String greetUser(@PathVariable Long userId) {
 
        // String url = "http://userservice:8081/users/" + userId;
String url = "http://localhost:8081/users/" + userId;

       
        Map user = restTemplate.getForObject(url, Map.class);

        if (user == null || user.get("name") == null) {
            return "User not found!";
        }

        String name = (String) user.get("name");
        return "Hello " + name + "!";
    }
}
