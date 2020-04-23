package com.example.cachedemo.repository;

import com.example.cachedemo.model.CoffeeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeOrderRepository extends JpaRepository<CoffeeOrder,Long> {
}
