package com.hui.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
public class ThyController {

    @RequestMapping(value = "/thytest")
    public String thytest(Model model){
    model.addAttribute("name", "thymeleaf");
        return "thyhello";
    }
}
