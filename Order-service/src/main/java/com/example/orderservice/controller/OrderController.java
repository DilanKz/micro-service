package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author Dilan
 * @created 25/11/2023 - 12:24 pm
 */

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @GetMapping
    public String test(){
        return "In order service";
    }

    @PostMapping("/save")
    public String save(String name){
        System.err.println(name);
        return "In order service"+name;
    }
}
