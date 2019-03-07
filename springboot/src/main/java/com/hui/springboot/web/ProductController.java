package com.hui.springboot.web;

import com.hui.springboot.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @RequestMapping(value = "/protest")
    public String protest(Model model){
        String htmlContent = "<p style='color:red'> 红色文字</p>";
        Product currentProduct =new Product(5,"product e", 200);

        model.addAttribute("htmlContent", htmlContent);
        model.addAttribute("currentProduct", currentProduct);

        return "protest";
    }
}
