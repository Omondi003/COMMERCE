package org.example.commerces.controller;

import org.example.commerces.Model.Product;
import org.example.commerces.Model.User_model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductController {
    Product product
    @GetMapping("{Product_id}")
    public User_model getProductDetails(@PathVariable("Product_id") String User_id) {

        return .getUser(User_id);
    }

    @GetMapping()
    public List<User_model> getAllUser_modelDetails() {

        return userService.getAllUsers();
    }

    @PostMapping
    public  String createUser_modelDetails(@RequestBody User_model user_model) {
        userService.createUser(user_model);
        return "User_model created";
    }

    @PutMapping
    public  String updateUser_modelDetails(@RequestBody User_model user_model) {
        userService.updateUser(user_model);
        return "User_model updated";
    }

    @DeleteMapping({"User_id"})
    public  String deleteUser_modelDetails(String User_id) {
        userService.deleteUser(User_id);
        return "User_model deleted";
    }
}
