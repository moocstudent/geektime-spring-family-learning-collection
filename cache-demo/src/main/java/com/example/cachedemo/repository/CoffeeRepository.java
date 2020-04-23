package com.example.cachedemo.repository;

import com.example.cachedemo.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee,Long> {
}
