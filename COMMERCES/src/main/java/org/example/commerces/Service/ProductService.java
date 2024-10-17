package org.example.commerces.Service;

import org.example.commerces.Model.Product_model;

import java.util.List;

public interface ProductService {
    public void createProduct(Product_model productModel);
    public void updateProduct(Product_model productModel);
    public void deleteProduct(Product_model product_model_id);

    void deleteProduct(String product_id);

    public Product_model getProduct(String product_id);
    public List<Product_model> getAllProducts();
}
