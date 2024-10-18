package org.example.commerces.Model;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class cart_model {
    private  String  id;

    private  String  Session_id;

    private String Product_id;

    private String quantity;
}
