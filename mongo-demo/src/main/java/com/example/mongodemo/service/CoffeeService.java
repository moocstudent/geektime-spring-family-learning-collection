package com.example.mongodemo.service;

import com.example.mongodemo.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * @Author: zhangQi
 * @Date: 2020-08-19 23:25
 */
@Service
public class CoffeeService {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 保存咖啡
     * @param coffee
     * @return
     */
    public int addCoffee(Coffee coffee) {
        Coffee save = mongoTemplate.save(coffee);
        if (save != null) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * 查找coffee根据name
     * @param name
     * @return
     */
    public List<Coffee> findCoffeeByName(String name){
        List<Coffee> coffees = mongoTemplate.find(Query.query(where("name").is(name)), Coffee.class);
        return coffees;
    }

    /**
     * todo 测试 mongo获取数据
     * @param cid
     * @return
     */
    public List<Coffee> findCoffeeById(String cid){
        List<Coffee> coffee = mongoTemplate.find(Query.query(where("cid").is(cid)), Coffee.class);
        return coffee;
    }

//    public int updateByName(Coffee coffee,String field){
//        mongoTemplate.updateFirst(Query.query(where("name").is(coffee.getName())),
//                new Update().set(field),)
//    }
}
