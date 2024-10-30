package org.example.commerces.Service.impl;

import lombok.AllArgsConstructor;
import org.example.commerces.Model.Product_model;
import org.example.commerces.Repository.ProductRepo;
import org.example.commerces.Service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public abstract class ProductImpl  implements ProductService {
    ProductRepo productRepo;
    @Override
    public void createProduct(Product_model productModel) {
      //productRepo.save(productModel);
    }

    @Override
    public void updateProduct(Product_model productModel) {
     // productRepo.save(productModel);
    }



    @Override
    public void deleteProduct(String product_id) {
       productRepo.deleteById(product_id);
    }

    @Override
    public Product_model getProduct(String product_id) {
      //  return productRepo.findById(product_id).get();
        return null;
    }

    @Override
    public List<Product_model> getAllProducts() {
       // return productRepo.findAll();
        return null;
    }
}
