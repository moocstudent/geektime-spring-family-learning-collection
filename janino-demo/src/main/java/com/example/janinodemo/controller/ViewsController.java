package com.example.janinodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ViewsController {

    @GetMapping("")
    public String index(){
        return "index";
    }

    @GetMapping("/edit")
    public String edit(){
        return "edit";
    }
}
