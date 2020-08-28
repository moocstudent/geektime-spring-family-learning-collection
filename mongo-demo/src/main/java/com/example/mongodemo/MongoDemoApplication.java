package com.example.mongodemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Slf4j
@EnableSwagger2
//public class MongoDemoApplication implements ApplicationRunner {
public class MongoDemoApplication {
    @Autowired
    private MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(MongoDemoApplication.class, args);
    }
//    @Bean
//    public MongoCustomConversions mongoCustomConversions() {
//        return new MongoCustomConversions(Arrays.asList(new MoneyReadConverter()));
//    }
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Coffee espresso = Coffee.builder()
//                .name("espresso")
//                .price(Money.of(CurrencyUnit.of("CNY"),20.0))
//                .createTime(new Date())
//                .updateTime(new Date()).build();
//        Coffee saved = mongoTemplate.save(espresso);
//        log.info("Coffee {}",saved);
//
//        List<Coffee> list = mongoTemplate.find(
//                query(where("name").is("espresso")),Coffee.class
//        );
//        log.info("Find {} Coffee",list.size());
//        list.forEach(c->log.info("Coffee {}",c));
//
//        Thread.sleep(1000);
//        UpdateResult result = mongoTemplate.updateFirst(query(where("name").is("espresso")),
//                new Update().set("price", Money.ofMajor(CurrencyUnit.of("CNY"), 30))
//                        .currentDate("updateTime"), Coffee.class);
//
//        log.info("Update Result: {}",result.getModifiedCount());
//        Coffee updateOne = mongoTemplate.findById(saved.getId(),Coffee.class);
//
//        mongoTemplate.remove(updateOne);
//    }
}
