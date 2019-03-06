package com.hui.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value="/hellotest")
    public String hellotest(){
        return "hello word springboot2";
    }
}
