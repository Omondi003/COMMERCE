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
public class User_address {
    @Id
    @GeneratedValue(strategy =GenerationType.UUID)
    private  String  id;

    private  String  user_id;

    private String Address;

    private String City;

    private String Country;

    private String Postal_code;


    private String Telephone_no;
}
