package org.example.commerces.Service.impl;

import lombok.AllArgsConstructor;
import org.example.commerces.Model.User_model;
import org.example.commerces.Repository.UserRepo;
import org.example.commerces.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class UserImpl  implements UserService {
    UserRepo userRepo;
    @Override
    public void createUser(User_model user_model) {
       // userRepo.save(user_model);
    }

    @Override
    public void updateUser(User_model user_model) {
      //  userRepo.save(user_model);
    }

    @Override
    public void deleteUser(String user_id) {
      //  userRepo.deleteById(user_id);
    }

    @Override
    public User_model getUser(String user_id) {

     //   return userRepo.findById(user_id).get();
        return null;
    }

    @Override
    public List<User_model> getAllUsers() {
      //  return userRepo.findAll();
        return null;
    }
}
