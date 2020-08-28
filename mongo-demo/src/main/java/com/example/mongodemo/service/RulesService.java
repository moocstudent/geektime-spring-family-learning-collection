package com.example.mongodemo.service;

import com.example.mongodemo.model.Rules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @Author: zhangQi
 * @Date: 2020-08-20 11:21
 * @D:MongoDb的增删改查
 */
@Service
public class RulesService {
    @Autowired
    private MongoTemplate mongoTemplate;

//    public Mono<Integer> saveRules(Rules rules){
//
//    }
}
