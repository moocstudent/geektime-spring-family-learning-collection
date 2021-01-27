package com.example.r2dbcdemo;

import com.example.r2dbcdemo.bean.Person;
import com.example.r2dbcdemo.service.PersonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
@Log4j2
public class R2dbcDemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(R2dbcDemoApplication.class, args);
    }

    @Autowired
    private PersonService personService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person 唐会娟 = Person.builder().id(1L).name("唐会娟").build();
        personService.setPerson(唐会娟);
        Flux<Person> personServiceByName = personService.findByName("唐会娟");
        System.out.println(personServiceByName);
    }
}
