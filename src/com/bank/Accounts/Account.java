package com.bank.Accounts;

import java.util.Scanner;
import com.bank.Date.*;
import com.bank.person.Person;

import java.util.*;

public class Account {
    private double id;
    private MyDate openingAccunt;
    private double balance;

    public Account() {
    }

    ;

    public Account(MyDate openingAccunt) {
        Random rand = new Random();
        this.id = rand.nextInt(900000) + 100000;
        this.openingAccunt = openingAccunt;
    }

    public double getId() {
        return id;
    }

    public MyDate getOpeningAccunt() {
        return openingAccunt;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setOpeningAccunt(MyDate openingAccunt) {
        this.openingAccunt = openingAccunt;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
