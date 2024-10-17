package org.example.commerces.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product_model {
    private  String  id;
    private  String  product_name;
    private String desc;
    private String SKU;
    private String Category_id;
    private String Inventory_id;
    private String Price;
    private String Discount_id;
}
