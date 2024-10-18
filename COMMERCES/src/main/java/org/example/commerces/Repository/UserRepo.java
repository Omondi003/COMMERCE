package org.example.commerces.Repository;

import org.example.commerces.Model.User_model;
import org.example.commerces.Tables.User_account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User_account, String> {
}
