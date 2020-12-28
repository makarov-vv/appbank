package com.other.appbank.entities;

import javax.persistence.*;

@Entity
@Table(name="Forms")
public class Form {

    @Id
    private long id;
    private String name;

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

    @Override
    public String toString(){
        return "Form: id="+id+" Name="+name+";";
    }


}
