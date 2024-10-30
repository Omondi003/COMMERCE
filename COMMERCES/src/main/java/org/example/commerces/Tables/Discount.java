package org.example.commerces.Tables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private  String  id;

    private  String name;

    private String description;

    private  String discountPercent;

    private String active;

}
