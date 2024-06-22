package com.project.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PageController {

    //TODO: Add the following methods to this class
    @GetMapping("/home")
    public String home(Model model){
        System.out.println("Home Page Handler");
        model.addAttribute("name", "Software Workshop Technologies Pvt. Ltd.");
        model.addAttribute("Youtube Channel", "Learn Code With Java Developer");
        model.addAttribute("Github Repository", "https://github.com/yadavikas004/smart-contact-manager");

        return "home";
    }
}
