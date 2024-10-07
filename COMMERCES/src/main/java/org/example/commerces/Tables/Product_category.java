package org.example.commerces.Tables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Product_category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String  id;

    private  String Name;

    private String Desc;

}
