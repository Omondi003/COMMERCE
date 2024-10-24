package org.example.commerces.controller;

import lombok.AllArgsConstructor;
import org.example.commerces.Model.User_model;
import org.example.commerces.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class userController {



    UserService userService;
    public userController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("{User_id}")
    public User_model getUser_modelDetails(@PathVariable("User_id") String User_id) {

        return userService.getUser(User_id);
    }

    @GetMapping()
    public List<User_model> getAllUser_modelDetails() {

        return userService.getAllUsers();
    }

    @PostMapping
    public  String createUser_modelDetails(@RequestBody User_model user_model) {
    userService.createUser(user_model);
        return "User_model created successfully";
    }

    @PutMapping
    public  String updateUser_modelDetails(@RequestBody User_model user_model) {
        userService.updateUser(user_model);
        return "User_model updated sucessfully";
    }

    @DeleteMapping({"User_id"})
    public  String deleteUser_modelDetails(String User_id) {
      userService.deleteUser(User_id);
        return "User_model deleted successfully";
    }
}
