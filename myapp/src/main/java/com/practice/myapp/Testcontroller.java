package com.practice.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Testcontroller {
    
    @RequestMapping("/test")
    @ResponseBody
    public String handle(){
        return "This is the Spring boot first one";
    }
    
}
