package com.sda.springboot.angulardemo.controller;


import com.sda.springboot.angulardemo.model.User;
import com.sda.springboot.angulardemo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    UserRepo repository;

    @Autowired
    public UserController(UserRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return repository.findAll();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        repository.save(user);
    }



}
