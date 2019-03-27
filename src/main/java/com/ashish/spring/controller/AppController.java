package com.ashish.spring.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/messages/{id}")
    public String getMessage(@PathVariable String id) {
        return "This works";

    }
}
