package com.liyl.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/common")
public class CommonController {

    @Autowired
    private Environment environment;

    @RequestMapping("/all")
    public String all(){
        return "hello world";
    }

    @RequestMapping(value = "/hook", method = RequestMethod.POST)
    public String env(){
        return environment.getProperty("dd");
    }
}
