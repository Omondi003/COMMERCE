package org.example.commerces.controller;

import org.example.commerces.Model.Cart_model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class cartController {
   CartService  cartService;
   @GetMapping("/{cart_id}")
   public Cart_model getCartDetails(@PathVariable("cart_id") String cart_id){
      return cartService.getCart(cart_id);
   }

   @GetMapping()
   public List<Cart_model> getAllCart_modelDetails() {

      return cartService.getAllCart();
   }

}
