package com.taxah.spring_dz4_1.controllers;

import com.taxah.spring_dz4_1.domain.WelcomeUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Controller
public class MyController {


    @RequestMapping
    public String helloPage(Model model){
        model.addAttribute("time", timeNow());
        return "index";
    }

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("user", new WelcomeUser());
        return "form";
    }

    @PostMapping("/accept")
    public String acceptForm(WelcomeUser user,Model model){
        model.addAttribute("name",user.getName());
        return "welcome";
    }

    private String timeNow(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        return currentDateTime.format(formatter);
    }
}
