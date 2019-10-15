package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    //    @RequestMapping(value = "/project", method = RequestMethod.GET)
    @GetMapping("/project")
    public String helloWorld() {
        return "index";
    }

    @GetMapping("/add")
    public String addUser(Model model){
        model.addAttribute("oo", "51651651615");

        return "index";
    }

}
