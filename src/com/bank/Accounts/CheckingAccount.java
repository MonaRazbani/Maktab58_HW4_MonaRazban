package com.bank.Accounts;
import com.bank.Date.*;
import com.bank.person.*;


public class CheckingAccount extends Account {
    private double limitless = 2000000;
    private double wage = 700;
    private Account bank;

    public CheckingAccount(MyDate openingAccunt) {
        super(openingAccunt);
    }

    public double getLimitless() {
        return limitless;
    }

    public double getWage() {
        return wage;
    }
}
