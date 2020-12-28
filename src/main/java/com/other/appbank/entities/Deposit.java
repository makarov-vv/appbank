package com.other.appbank.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Deposits")
public class Deposit {

    @Id
    private long id;

    @OneToOne
    @JoinColumn(name="bank")
    private Bank bank;

    @OneToOne
    @JoinColumn(name="client")
    private Client client;

    private java.sql.Date opening;
    private float percents;
    private int time;

    public long getId() {
        return id;
    }

    public void setId(long _id) {
        this.id = _id;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank _bank) {
        this.bank = _bank;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client _client) {
        this.client = _client;
    }

    public java.sql.Date getDate() {
        return opening;
    }

    public void setDate(java.sql.Date opening) {
        this.opening = opening;
    }

    public float getPercents() {
        return percents;
    }

    public void setPercents(float _percents) {
        this.percents = _percents;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int _time) {
        this.time = _time;
    }


    @Override
    public String toString(){
        return "Deposit: id="+id+" Client="+client.getName()+" Bank="+bank.getName()+" Opening="+opening+" Percents="+percents+" Time="+time+";";
    }


}
