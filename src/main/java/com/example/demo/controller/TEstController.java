package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TEstController {

    @RequestMapping(value = "/hello")
    public String rrt() {

        System.out.println("First brench !");
        System.out.println("First brench second commit !");
        System.out.println("First brench ferd commit !");

        return "Hello world !!!";

    }

}
