package com.Project.User.controller;

import com.Project.User.classes.University;
import com.Project.User.entity.User;
import com.Project.User.services.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController

public class UserController {
    @Autowired
    userServices userservices;

    @PostMapping("/saveUser")
    public Mono<User> saveAllUser(@RequestBody User user){
        return userservices.saveUser(user);
    }
    @GetMapping("/user")
    public Mono<University> universityDetails(){
         return userservices.getAlldetails();
    }
}
