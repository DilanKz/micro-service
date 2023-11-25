package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
