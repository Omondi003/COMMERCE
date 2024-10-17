package org.example.commerces.Service;

import org.example.commerces.Model.Product;
import org.example.commerces.Model.User_model;

import java.util.List;

public interface ProductService {
    public void createProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(Product product_id);
    public Product getProduct(String product_id);
    public List<Product> getAllProducts();
}
