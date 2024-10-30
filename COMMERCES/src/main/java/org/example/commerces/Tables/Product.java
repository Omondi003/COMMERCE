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
public class Product {
    @Id
    @GeneratedValue(strategy =GenerationType.UUID)
    private  String  id;

    private  String  product_name;

    private String description;

    private String SKU;

    private String Category_id;

    private String Inventory_id;

    private String Price;

    private String Discount_id;

}
