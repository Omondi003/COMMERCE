package org.example.commerces.controller;

import org.example.commerces.Model.User_model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class userController {

    public User_model getUser_modelDetails(String username) {
        return new User_model();
    }
}
