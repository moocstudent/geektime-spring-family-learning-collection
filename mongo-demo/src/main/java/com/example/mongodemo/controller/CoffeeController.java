package com.example.mongodemo.controller;

import com.example.mongodemo.model.Coffee;
import com.example.mongodemo.service.CoffeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2020-08-20 9:26
 */
@Api(value = "咖啡控制层",tags = "咖啡控制层")
@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;

    @PostMapping("/save")
    @ApiOperation("保存咖啡")
    public int saveCoffee(Coffee coffee){
        System.out.println("coffee:"+coffee);
        return coffeeService.addCoffee(coffee);
    }

    @GetMapping("/{cid}")
    @ApiOperation("获取coffee根据cid")
    public List<Coffee> getCoffeeById(@PathVariable("cid") String cid){
        return coffeeService.findCoffeeById(cid);
    }
}
