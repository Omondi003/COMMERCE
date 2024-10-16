package org.example.commerces.Service;

import org.example.commerces.Model.User_model;

import java.util.List;

public interface UserService {
    public String createUser(User_model user_model);
    public String updateUser(User_model user_model);
    public String deleteUser(String user_id);
    public User_model getUser(String user_id);
    public List<User_model> getAllUsers();
}
