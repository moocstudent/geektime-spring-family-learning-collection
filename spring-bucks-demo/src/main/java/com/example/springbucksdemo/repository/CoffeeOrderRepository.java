package com.example.springbucksdemo.repository;

import com.example.springbucksdemo.model.CoffeeOrder;

import java.util.List;

public interface CoffeeOrderRepository extends com.example.springbucksdemo.repository.BaseRepository<CoffeeOrder, Long> {
    List<CoffeeOrder> findByCustomerOrderById(String customer);
    List<CoffeeOrder> findByItems_Name(String name);
}
