package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TEstController {

    @RequestMapping(value = "/hello")
    public String rrt() {

        System.out.println(1);

        return "Hello world !!!";

    }

}
