package com.other.appbank.controllers;

import com.other.appbank.entities.Bank;
import com.other.appbank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BankController {

    @Autowired
    private BankRepository bankRep;

    @GetMapping("/banks")
    public String BanksMain(Model model){
        Iterable<Bank> list = bankRep.findAll();
        model.addAttribute("list", list);
        return "banks-list";
    }

    @GetMapping("/banks/add")
    public String BanksAdd(Model model){
        return "banks-add";
    }

    @PostMapping("/banks/add")
    public String BanksAddPost(@RequestParam String name,
                               @RequestParam String bik,
                               Model model){
        bankRep.save(new Bank(bankRep.count(), name, bik));
        return "redirect:/banks";
    }

    @GetMapping("/banks/{id}")
    public String BanksId (@PathVariable(value="id") long id, Model model){
        if(bankRep.existsById(id)){
            Optional<Bank> bank = bankRep.findById(id);
            ArrayList<Bank> tmp = new ArrayList<>();
            bank.ifPresent(tmp::add);
            model.addAttribute("bank", tmp);
            return "bank-details";
        }
        else{
            return "redirect:/banks";
        }
    }

    @GetMapping("/banks/{id}/edit")
    public String BanksEdit (@PathVariable(value="id") long id, Model model){
        if(bankRep.existsById(id)){
            Optional<Bank> bank = bankRep.findById(id);
            ArrayList<Bank> tmp = new ArrayList<>();
            bank.ifPresent(tmp::add);
            model.addAttribute("bank", tmp);
            return "bank-edit";
        }
        else{
            return "redirect:/banks";
        }
    }

    @PostMapping("/banks/{id}/edit")
    public String BanksEditPost(@PathVariable(value="id") long id,
                                @RequestParam String name,
                                @RequestParam String bik,
                                Model model){
        if(bankRep.existsById(id)) {
            Optional<Bank> bank = bankRep.findById(id);
            Bank tmp = bank.get();
            tmp.setName(name);
            tmp.setBik(bik);
            bankRep.save(tmp);
        }
        return "redirect:/banks";
    }

    @PostMapping("/banks/{id}/remove")
    public String BanksRemovePost(@PathVariable(value="id") long id,
                                Model model){
        if(bankRep.existsById(id)) {
            Optional<Bank> bank = bankRep.findById(id);
            bankRep.delete(bank.get());
        }
        return "redirect:/banks";
    }
}
