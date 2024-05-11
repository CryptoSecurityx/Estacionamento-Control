package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class main {

    @GetMapping("/login")

    public String toLogin() {
        return "404";
    }


}
