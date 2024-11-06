package org.example.commerces.Service;

import org.example.commerces.Model.Discount_model;
import org.example.commerces.Tables.Discount;

public interface DiscountService {
    void createProduct(Discount_model discount_model);
    void updateProduct(Discount_model discount_model);
    void deleteProduct(Discount_model discount_model_id );

}
