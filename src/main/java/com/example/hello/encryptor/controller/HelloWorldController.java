package com.example.hello.encryptor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jerry
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World, Encryptor Boot!";
    }

}
