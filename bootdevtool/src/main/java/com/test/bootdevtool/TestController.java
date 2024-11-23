package com.test.bootdevtool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody

    
    public String test(){
        int a=67;
        int b=189;

        return "this is for test"+(a+b);
    }
    
}
