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
public class Cart_items {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private  String  id;

    private  String  Session_id;

    private String Product_id;

    private String quantity;
}
