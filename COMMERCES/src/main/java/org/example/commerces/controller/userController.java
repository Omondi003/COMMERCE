package org.example.commerces.controller;

import org.example.commerces.Model.User_model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class userController {

    User_model user_model;
    @GetMapping("{User_id}")
    public User_model getUser_modelDetails(String User_id) {
        return  user_model;
    }

    public  String createUser_modelDetails(@RequestBody User_model user_model) {
       this.user_model = user_model;
        return "User_model created";
    }
}
