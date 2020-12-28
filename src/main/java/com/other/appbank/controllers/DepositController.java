package com.other.appbank.controllers;

import com.other.appbank.entities.Deposit;
import com.other.appbank.repository.DepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DepositController {

    @Autowired
    private DepositRepository depositRep;

    @GetMapping("/deposits")
    public String Clients(Model model){
        List<Deposit> list = depositRep.findAll();
        String temp = "";
        for(int i=0; i<list.size(); i++){
            temp += list.get(0).toString()+"/n";
        }
        model.addAttribute("temp", temp);
        return "banks-list";
    }
}