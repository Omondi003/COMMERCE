package org.example.commerces.Service.impl;

import org.example.commerces.Model.Product_model;
import org.example.commerces.Repository.ProductRepo;
import org.example.commerces.Service.ProductService;

import java.util.List;

public class ProductImpl  implements ProductService {
    ProductRepo productRepo;
    @Override
    public void createProduct(Product_model productModel) {
      productRepo.save(productModel);
    }

    @Override
    public void updateProduct(Product_model productModel) {
      productRepo.save(productModel);
    }

    @Override
    public void deleteProduct(Product_model product_model_id) {

    }

    @Override
    public void deleteProduct(String product_id) {
       productRepo.deleteById(product_id);
    }

    @Override
    public Product_model getProduct(String product_id) {
        return null;
    }

    @Override
    public List<Product_model> getAllProducts() {
        return List.of();
    }
}
