package com.example.webfluxmongodbdemo.webflux.controller;

import com.example.webfluxmongodbdemo.domain.City;
import com.example.webfluxmongodbdemo.handler.CityHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author: zhangQi
 * @Date: 2020-08-09 17:45
 */
@RestController
@RequestMapping("/city")
public class CityWebFluxController {
    @Autowired
    private CityHandler cityHandler;

    @GetMapping("/{id}")
    public Mono<City> findCityById(@PathVariable("id")String id){
        return cityHandler.findCityById(id);
    }

    @GetMapping()
    public Flux<City> findAllCity(){
        return cityHandler.findAllCity();
    }

    @PostMapping()
    public Mono<City> saveCity(@RequestBody City city){
        return cityHandler.save(city);
    }

    @PutMapping()
    public Mono<City> modifyCity(@RequestBody City city){
        return cityHandler.modifyCity(city);
    }

    @DeleteMapping("/{id}")
    public Mono<String> deleteCity(@PathVariable("id")String id){
        return cityHandler.deleteCity(id);
    }
}
