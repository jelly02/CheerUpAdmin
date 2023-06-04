package com.cheerup.cheerupAdmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestApiController {

    @GetMapping("/")
    public String test(){
        return "hello";
    }
}
