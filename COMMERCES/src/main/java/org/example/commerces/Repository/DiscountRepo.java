package org.example.commerces.Repository;

import org.example.commerces.Tables.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepo extends JpaRepository<Discount , String> {
}
