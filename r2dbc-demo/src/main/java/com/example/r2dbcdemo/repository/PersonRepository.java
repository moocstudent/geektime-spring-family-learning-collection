package com.example.r2dbcdemo.repository;

import com.example.r2dbcdemo.bean.Person;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * @Author: zhangQi
 * @Date: 2020-09-14 23:53
 */
public interface PersonRepository extends ReactiveCrudRepository<Person,Integer> {
    @Query("SELECT * FROM person WHERE name = :name")
    Flux<Person> findAllByName(String name);
}
