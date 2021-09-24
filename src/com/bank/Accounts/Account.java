package com.bank.Accounts;

import java.util.Scanner;
import com.bank.Date.*;
import com.bank.person.Customer;
import com.bank.person.Person;

import java.util.*;

public class Account {
    private double id;
    private MyDate openingAccunt;
    private double balance;
    private String type ;
    public Account() {
    }
    public Account(MyDate openingAccunt) {
        Random rand = new Random();
        this.id = rand.nextInt(900000) + 100000;
        this.openingAccunt = openingAccunt;
    }

    public Account(MyDate openingAccunt, double balance) {
        Random rand = new Random();
        this.id = rand.nextInt(900000) + 100000;
        this.openingAccunt = openingAccunt;
        this.balance=balance;
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

    public void withdrawMoney( double amountMoney ) {

            if (getBalance() - amountMoney > 10000) {
               setBalance(getBalance() - amountMoney);
            }
            else System.out.println("Lack of inventory \n not done  ");
    }

    public void depositMoney ( double amountMoney){
        setBalance(getBalance()+amountMoney);
        System.out.println("new balance :"+getBalance());

    }

    public Double calculateInterests (){
        return null;
    }

    @Override
    public String toString() {
        return
                "   " + id +
                " opening account date :" + openingAccunt.toString() +
                " balance :" + balance ;
    }

}
