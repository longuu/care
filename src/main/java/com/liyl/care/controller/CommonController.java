package com.liyl.care.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/common")
public class CommonController {


    @RequestMapping("/all")
    public String all(){
        return "hello world";
    }
}
