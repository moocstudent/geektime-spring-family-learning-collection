package com.example.observerdemo.repository;

import com.example.observerdemo.model.Coffee;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 17:03
 */
@Repository
public interface CoffeeRepository extends BaseRepository<Coffee,Integer> {
}
