package com.example.observerdemo.repository;

import com.example.observerdemo.model.CoffeeOrder;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 17:19
 * mapper repository dao层 返回原始返回 如int Entity
 */

public interface OrderRepository extends BaseRepository<CoffeeOrder,Long> {
}
