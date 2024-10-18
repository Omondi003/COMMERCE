package org.example.commerces.controller;

import org.example.commerces.Model.Product_model;
import org.example.commerces.Model.User_model;
import org.example.commerces.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    ProductService productService;
    @GetMapping("/{product_id}")
    public Product_model getProductDetails(@PathVariable("product_id") String product_id) {

        return productService.getProduct(product_id);
    }

    @GetMapping()
    public List<Product_model> getAllProduct_modelDetails() {

        return productService.getAllProducts();
    }

    @PostMapping
    public  String createProduct_modelDetails(@RequestBody Product_model product_model) {
      productService.createProduct(product_model);
        return "Product_model created";
    }

    @PutMapping
    public  String updateProduct_modelDetails(@RequestBody Product_model product_model) {
        productService.updateProduct(product_model);
        return "Product_model updated successfully";
    }

    @DeleteMapping({"product_id"})
    public  String deleteProduct_modelDetails(String product_id) {
        productService.deleteProduct(product_id);
        return "User_model deleted";
    }
}
