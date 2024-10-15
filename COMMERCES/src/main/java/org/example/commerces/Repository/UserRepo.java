package org.example.commerces.Repository;

import org.example.commerces.Model.User_model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User_model, String> {
}
