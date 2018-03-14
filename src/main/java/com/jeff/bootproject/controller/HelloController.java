package com.jeff.bootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jeff
 * <p>Date 2018/3/8</p>
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello.html")
    public String hello(Model model){
        model.addAttribute("account", "admin");
        return "hello";
    }

}
