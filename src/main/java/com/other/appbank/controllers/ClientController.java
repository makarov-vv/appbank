package com.other.appbank.controllers;

import com.other.appbank.entities.Client;
import com.other.appbank.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository clientRep;

    @GetMapping("/clients")
    public String Clients(Model model){
        List<Client> list = clientRep.findAll();
        String temp = "";
        for(int i=0; i<list.size(); i++){
            temp += list.get(0).toString()+"/n";
        }
        model.addAttribute("temp", temp);
        return "banks-list";
    }
}
