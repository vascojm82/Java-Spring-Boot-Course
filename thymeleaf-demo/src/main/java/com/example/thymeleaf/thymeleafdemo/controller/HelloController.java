package com.example.thymeleaf.thymeleafdemo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")       //this url serves the template
    public String hello(Model model){   //method to be mapped as a web method
        model.addAttribute("message", "Hello from Spring MVC Thymeleaf");   //Add stuff to our template

        return "hello";     //Spring will return a template named 'hello' that should be present in the templates folder
    }
}
