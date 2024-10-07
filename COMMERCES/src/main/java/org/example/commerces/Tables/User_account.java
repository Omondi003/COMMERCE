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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String id;

    private String name;

    private String Address;


    private String phoneNumber;


}
