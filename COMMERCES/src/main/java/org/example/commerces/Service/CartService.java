package org.example.commerces.Service;

import org.example.commerces.Model.Cart_model;
import org.example.commerces.Model.Product_model;

import java.util.List;

public interface CartService {
    void createProduct(Cart_model cart_model );
    void updateProduct(Cart_model cart_model);
    void deleteProduct(Cart_model cart_model_id);

    void deleteProduct(String cart_id);

   Cart_model getProduct(String cart_id);
    List<Cart_model> getAllProducts();
}
