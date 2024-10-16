package org.example.commerces.Service.impl;

import org.example.commerces.Model.User_model;
import org.example.commerces.Service.UserService;

import java.util.List;

public class UserImpl  implements UserService {
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
