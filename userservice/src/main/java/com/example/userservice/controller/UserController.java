package com.example.userservice.controller;

import com.example.userservice.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

   
    private static final Map<Long, User> users = new HashMap<>();

    static {
        users.put(1L, new User(1L, "Dana"));
        users.put(2L, new User(2L, "Yossi"));
        users.put(3L, new User(3L, "Noa"));
    }

    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return users.get(id); 
    }
}
