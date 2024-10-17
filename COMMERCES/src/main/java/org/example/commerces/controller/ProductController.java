package org.example.commerces.controller;

import org.example.commerces.Model.Product_model;
import org.example.commerces.Model.User_model;
import org.example.commerces.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductController {
    ProductService productService;
    @GetMapping("{product_id}")
    public Product_model getProductDetails(@PathVariable("product_id") String product_id) {

        return productService.getProduct(product_id);
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
