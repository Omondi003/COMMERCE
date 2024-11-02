package org.example.commerces.Service.impl;

import org.example.commerces.Model.Cart_model;
import org.example.commerces.Service.CartService;
import org.example.commerces.Tables.Cart_items;

import java.util.List;

public class OrderImpl implements CartService {
    @Override
    public void createProduct(Cart_model cart_model) {

    }

    @Override
    public void updateProduct(Cart_model cart_model) {

    }

    @Override
    public void deleteProduct(Cart_model cart_model_id) {

    }

    @Override
    public void deleteProduct(String cart_id) {

    }

    @Override
    public Cart_model getProduct(String cart_id) {
        return null;
    }

    @Override
    public List<Cart_items> getAllProducts() {
        return List.of();
    }
}
