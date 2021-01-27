package com.example.r2dbcdemo.service;

import com.example.r2dbcdemo.bean.Person;
import com.example.r2dbcdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author: zhangQi
 * @Date: 2020-09-14 23:58
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Flux<Person> findByName(String name){
        return personRepository.findAllByName(name);
    }

    public Mono<Person> setPerson(Person person){
        return personRepository.save(person);
    }
}

