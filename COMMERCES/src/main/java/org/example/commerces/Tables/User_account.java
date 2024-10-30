package org.example.commerces.Tables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class User_account {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private  String  id;

    private String Username;

    private String password;

    private String first_name;

    private String last_name;

    private String phoneNumber;


}
