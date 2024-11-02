package org.example.commerces.controller;

import org.example.commerces.Model.Cart_model;
import org.example.commerces.Model.Product_model;
import org.example.commerces.Service.CartService;
import org.example.commerces.Tables.Cart_items;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class cartController {
   CartService cartService;
   @GetMapping("/{CartId}")
   public Cart_model getCartDetails(@PathVariable("CartId") String cartId) {

      return cartService.getProduct(cartId);
   }
   @GetMapping
   public List<Cart_items> getProducts() {

      return cartService.getAllProducts();
   }
   @PostMapping
   public String createCartService(@RequestBody Cart_model cart_model) {
        cartService.createProduct(Cart_model);
      return "Product_model created successfully";

   }
   @PutMapping
   public String updateCartService(@RequestBody Cart_model cart_model) {
       cartService.createProduct(Cart_model);
       return "Product_model updated successfully";

   }
   @DeleteMapping("CartId")
   public String deleteCartService( String cartId) {
      cartService.deleteProduct(cartId);
      return "Product_model deleted successfully";
   }



}
