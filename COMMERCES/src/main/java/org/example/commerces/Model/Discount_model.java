package org.example.commerces.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Discount_model {
    private  String  id;

    private  String name;

    private String description;

    private  String discountPercent;

    private String active;
}
