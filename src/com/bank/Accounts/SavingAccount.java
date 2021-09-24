package com.bank.Accounts;
import java.util.Scanner;
import com.bank.Date.*;
import com.bank.person.Person;


public class SavingAccount extends Account {
    private double profit = 0.1;
    private double primitiveBalance ;

    public SavingAccount(MyDate openingAccunt, double balance) {
        super(openingAccunt, balance);
        this.primitiveBalance=balance;
    }

    public double getProfit() {
        return profit;
    }

    public double getPrimitiveBalance() {
        return primitiveBalance;
    }

    @Override
    public void withdrawMoney( double amountMoney){
        if (amountMoney>getBalance()-getPrimitiveBalance()-10000){
            super.withdrawMoney(amountMoney);
        }
        else System.out.println("cant withdraw from your primitive balance ");
    }

    @Override
    public void depositMoney( double amountMoney) {
        super.depositMoney( amountMoney);
    }

    public void DepositInterest( MyDate date ){
        if (date.getDay()==getOpeningAccunt().getDay()){
            depositMoney( getPrimitiveBalance()*getProfit());
            System.out.println("new balance : "+getBalance());
        }
        else System.out.println("Profit deposit time has not arrived");
    }


    @Override
    public String toString() {

        return "Type : SavingAccount" +super.toString()+
                " profit :" + profit ;
    }
}
