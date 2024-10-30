package org.example.commerces.Service;

import org.example.commerces.Model.Product_model;

import java.util.List;

public interface ProductService {
    void createProduct(Product_model productModel);
    void updateProduct(Product_model productModel);
    void deleteProduct(Product_model product_model_id);

    void deleteProduct(String product_id);

    Product_model getProduct(String product_id);
    List<Product_model> getAllProducts();
}
