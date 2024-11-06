package org.example.commerces.Service;

import org.example.commerces.Model.Discount_model;
import org.example.commerces.Tables.Discount;

import java.util.List;

public interface DiscountService {
    void createProduct(Discount_model discount_model);
    void updateProduct(Discount_model discount_model);
    void deleteProduct(String discount_id );
    Discount_model getProduct(String discount_id);
    List<Discount_model> getProducts();

}
