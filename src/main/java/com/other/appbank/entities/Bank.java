package com.other.appbank.entities;

import javax.persistence.*;

@Entity
@Table(name="Banks")
public class Bank {

    @Id
    private long id;

    public Bank(){}

    public Bank(long _id, String _name, String _bik) {
        this.id = _id;
        this.name = _name;
        this.bik = _bik;
    }

    private String name;
    private String bik;

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

    public String getBik(){
        return bik;
    }

    public void setBik(String _bik){
        this.bik=_bik;
    }

    @Override
    public String toString(){
        return "Bank: id="+id+" Name="+name+" BIK="+bik+";";
    }


}
