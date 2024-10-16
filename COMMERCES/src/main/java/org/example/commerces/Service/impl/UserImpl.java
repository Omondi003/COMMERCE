package org.example.commerces.Service.impl;

import lombok.AllArgsConstructor;
import org.example.commerces.Model.User_model;
import org.example.commerces.Repository.UserRepo;
import org.example.commerces.Service.UserService;

import java.util.List;
@AllArgsConstructor

public class UserImpl  implements UserService {
    UserRepo userRepo;
    @Override
    public String createUser(User_model user_model) {
        return "";
    }

    @Override
    public String updateUser(User_model user_model) {
        return "";
    }

    @Override
    public String deleteUser(String user_id) {
        return "";
    }

    @Override
    public User_model getUser(String user_id) {
        return null;
    }

    @Override
    public List<User_model> getAllUsers() {
        return List.of();
    }
}
