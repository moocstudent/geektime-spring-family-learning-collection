package com.example.observerdemo.service;

import com.example.observerdemo.model.Coffee;
import com.example.observerdemo.repository.CoffeeRepository;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 16:53
 * service层返回Single<></>
 */
@Service
public class CoffeeService {
    @Autowired
    private CoffeeRepository coffeeRepository;

    /**
     * add one coffee instance
     * @param coffee
     * @return
     */
    public Single<Coffee> testAddCoffee(Coffee coffee) {
        return Single.create(sub -> {
            try {
                Coffee save = coffeeRepository.save(coffee);
                sub.onSuccess(save);
            } catch (Exception e) {
                sub.onError(e);
            }
        });
    }
}
