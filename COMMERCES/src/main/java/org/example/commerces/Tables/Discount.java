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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String  id;

    private  String Name;

    private String Desc;

    private  String Discount_percent;

    private String Active;
}
