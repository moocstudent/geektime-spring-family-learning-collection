package com.example.webfluxmongodbdemo.dao;

import com.example.webfluxmongodbdemo.domain.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhangQi
 * @Date: 2020-08-09 17:30
 */
@Repository
public interface CityRepository extends ReactiveMongoRepository<City,Long> {
}
