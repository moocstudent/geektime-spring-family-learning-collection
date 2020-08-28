//package com.example.webfluxmongodbdemo.handler;
//
//import com.example.webfluxmongodbdemo.dao.RuleRepository;
//import com.example.webfluxmongodbdemo.domain.Rule;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
///**
// * @Author: zhangQi
// * @Date: 2020-08-21 10:01
// */
//@Component
//public class RuleHandler {
//
//    private final RuleRepository ruleRepository;
//
//    @Autowired
//    public RuleHandler(RuleRepository ruleRepository){
//        this.ruleRepository=ruleRepository;
//    }
//
//    public Mono<Rule> save(Rule rule){
//        return ruleRepository.save(rule);
//    }
//
//    public Mono<Rule> findRuleById(Long id){
//        return ruleRepository.findById(id);
//    }
//
//    public Flux<Rule> findAllRules(){
//        return ruleRepository.findAll();
//    }
//
//    public Mono<Rule> modifyRule(Rule rule){
//        return ruleRepository.save(rule);
//    }
//
//    public Mono<Long> deleteRule(Long id){
//        return ruleRepository.deleteById(id)
//                .flatMap(
//                        mono->Mono.create(ruleMonoSink->ruleMonoSink.success(id))
//                );
//    }
//}
