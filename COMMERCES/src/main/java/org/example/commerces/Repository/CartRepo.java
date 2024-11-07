package org.example.commerces.Repository;

import org.example.commerces.Tables.Cart_items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo  JpaRepository<Cart_items,String> {
}
