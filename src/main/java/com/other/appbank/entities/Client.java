package com.other.appbank.entities;

import com.other.appbank.BankApplication;
import com.other.appbank.controllers.MainController;
import com.other.appbank.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Clients")
public class Client {

    @Id
    private long id;
    private String name;
    private String description;
    private String adress;

    @ManyToOne
    @JoinColumn(name="form")
    private Form form;

    public long getId(){
        return id;
    }

    public void setId(long _id){
        this.id=_id;
    }

    public String getName(){
        return name;
    }

    public void setName(String _name){
        this.name=_name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String _description){
        this.name=_description;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String _adress) {
        this.adress = _adress;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form _form) {
        this.form = _form;
    }


    @Override
    public String toString(){
        return "Client: id="+id+" Name="+name+" Description="+description+" Adress="+adress+" Form="+form.getName()+";";
    }


}
