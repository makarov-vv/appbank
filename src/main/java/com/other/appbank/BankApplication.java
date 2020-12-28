package com.other.appbank;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BankApplication {//implements CommandLineRunner {


    public static void main(String[] args)  {
        SpringApplication.run(BankApplication.class, args);
    }

//    public void run(String... args) throws Exception{
//        List<Form> forms = formRep.findAll();
//        Add("ОАО");
//        forms.forEach(System.out :: println);
//    }

//    public void ChangeById(long _id, String _name){
//        formRep.findById(_id).get().setName(_name);
//    }
//
//    public void Delete(long _id){
//        formRep.deleteById(_id);
//    }
//
//    public void Add(String _name){
//        Form f = new Form();
//        f.setId(formRep.count());
//        f.setName(_name);
//        formRep.save(f);
//    }
}
