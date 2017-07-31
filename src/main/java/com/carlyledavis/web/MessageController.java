package com.carlyledavis.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/messaging")
public class MessageController {
    @RequestMapping( value = "/hello")
    public String hello(){
        return "Hello";
    }
}
