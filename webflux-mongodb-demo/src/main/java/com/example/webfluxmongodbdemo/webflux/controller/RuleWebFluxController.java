//package com.example.webfluxmongodbdemo.webflux.controller;
//
//import com.example.webfluxmongodbdemo.domain.Rule;
//import com.example.webfluxmongodbdemo.handler.RuleHandler;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
//import org.springframework.web.bind.annotation.*;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
///**
// * @Author: zhangQi
// * @Date: 2020-08-21 10:30
// */
//@RestController
//@RequestMapping("/rule")
//public class RuleWebFluxController {
//    @Autowired
//    private RuleHandler ruleHandler;
//    @Autowired
//    private ReactiveMongoTemplate reactiveMongoTemplate;
//
//    @GetMapping("/{id}")
//    public Mono<Rule> findRuleById(@PathVariable("id") Long id){
//        return reactiveMongoTemplate.findById(id, Rule.class);
//    }
//
//    @GetMapping()
//    public Flux<Rule> findAllRules(){
//        return reactiveMongoTemplate.findAll(Rule.class);
//    }
//
//
//    @PostMapping()
//    public Mono<Rule> saveRule(@RequestBody Rule rule){
//        return reactiveMongoTemplate.save(rule);
//    }
//
//    @PutMapping()
//    public Mono<Rule> modifyRule(@RequestBody Rule rule){
//        return reactiveMongoTemplate
//    }
//
//    @DeleteMapping("/{id}")
//    public Mono<Long> deleteRule(@PathVariable("id")Long id){
//        return ruleHandler.deleteRule(id);
//    }
//}
