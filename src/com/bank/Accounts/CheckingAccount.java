package com.bank.Accounts;
import com.bank.Date.*;
import com.bank.person.*;


public class CheckingAccount extends Account {
    private double limitless = 2000000;
    private double wage = 700;
    private double balance ;

    public CheckingAccount(MyDate openingAccunt, double balance) {
        super(openingAccunt, balance);
    }

    public double getLimitless() {
        return limitless;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public void withdrawMoney(Account origin, double amountMoney) {
        if (amountMoney <= getLimitless()) {
            super.withdrawMoney(origin, amountMoney);
            super.withdrawMoney(origin, 700);
        }
    }

    @Override
    public String toString() {
        return "Type : CheckingAccount " +super.toString()+
                " balance :" + balance ;
    }


}
