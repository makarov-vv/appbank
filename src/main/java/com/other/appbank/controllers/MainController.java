package com.other.appbank.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class MainController {

    @GetMapping("/")
    public String Main(Model model){
        String temp = "Главная страница";
        model.addAttribute("temp", temp);
        return "main";
    }
}
