package org.example.commerces.Repository;

import org.example.commerces.Model.Product_model;
import org.example.commerces.Tables.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, String> {
}