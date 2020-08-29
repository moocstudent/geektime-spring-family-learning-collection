package com.example.observerdemo.service;

import com.example.observerdemo.model.Coffee;
import com.example.observerdemo.model.CoffeeOrder;
import com.example.observerdemo.repository.OrderRepository;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 17:16
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Single<Long> create(CoffeeOrder order) {
        return Single.create(sub -> {
            Long id = null;
            try {
                id = orderRepository.save(order).getId();
                sub.onSuccess(id);
            } catch (Exception e) {
                sub.onError(e);
            }
        });
    }

    public Single<List<CoffeeOrder>> findAll(){
        return Single.create(sub->{
            try {
                List<CoffeeOrder> coffeeOrdersList = new ArrayList();
                orderRepository.findAll().forEach(o->coffeeOrdersList.add(o));
                sub.onSuccess(coffeeOrdersList);
            } catch (Exception e) {
                sub.onError(e);
            }
        });
    }

//    public Single<CoffeeOrder> findById(Long id){
//        return Single.create(sub->{
//            Optional<CoffeeOrder> coffeeOrder = orderRepository.findById(id);
//        });
//    }

}
