package com.elitegroup.uiproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/create")
    public String create() {
        return "home/create";
    }

    @GetMapping("/login")
    public String login() {
        return "home/login";
    }
}
