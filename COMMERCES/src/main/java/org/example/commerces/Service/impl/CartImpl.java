package org.example.commerces.Service.impl;

import lombok.AllArgsConstructor;
import org.example.commerces.Model.Cart_model;
import org.example.commerces.Repository.CartRepo;
import org.example.commerces.Service.CartService;

import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class CartImpl implements CartService {
    CartRepo cartRepo;

    @Override
    public void createProduct(Cart_model cart_model) {
    //cartRepo.save(cart_model);
    }

    @Override
    public void updateProduct(Cart_model cart_model) {
     //cartRepo.save(cart_model)
    }

    @Override
    public void deleteProduct(Cart_model cart_model_id) {

    }

    @Override
    public void deleteProduct(String cart_id) {
     //cartRepo.deleteById(cart_id);
    }

    @Override
    public Cart_model getProduct(String cart_id) {
        return null;
    }

    @Override
    public List<Cart_model> getAllProducts() {
       // return cartRepo.findAll();
    }
}
