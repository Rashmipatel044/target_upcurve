package com.thymeleafpractical.thymeleafpractical.Controller;


import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

@RequestMapping(value="/about",method = RequestMethod.GET)
    public String about(Model model){


        System.out.println("Inside about handler.....");
        model.addAttribute("name","Rashmi Patel");
        model.addAttribute("CurrentDate", new Date());
        return "about";
        //about.html
    }
    @GetMapping("example-loop")
    public String iterateHandler(Model m){

        List<String>names=List.of("Ankit","Laxmi","Karan","John");
m.addAttribute("names", names);
        return "iterate";
    }
    
}
