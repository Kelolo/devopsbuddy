package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenzhao on 3/18/17.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHellow(){
        return "index";
    }
}
