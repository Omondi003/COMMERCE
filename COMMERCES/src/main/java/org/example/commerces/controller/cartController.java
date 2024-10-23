package org.example.commerces.controller;

import org.example.commerces.Model.Cart_model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class cartController {
   CartService  cartService;
   @GetMapping("/{product_id}")
   public Product_model getProductDetails(@PathVariable("product_id") String product_id) {

      return productService.getProduct(product_id);
   }

   @GetMapping()
   public List<Product_model> getAllProduct_modelDetails() {

      return productService.getAllProducts();
   }

}
