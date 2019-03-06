package com.hui.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHolleController {

    @RequestMapping(value = "/testhello")
    public String testhello(){

        return "this is test springbootdfsfdfdffds";
    }

    @RequestMapping(value = "/testone")
    public String testone(){

        return "this is onefggfggdffssddcgdfgsd";
    }



    @RequestMapping(value = "/testoneee")
    public String testoneee(){

        return "this is onefggfggdffssddcgdfgsd";
    }

}
