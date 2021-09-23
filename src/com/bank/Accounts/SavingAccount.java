package com.bank.Accounts;
import java.util.Scanner;
import com.bank.Date.*;
import com.bank.person.Person;


public class SavingAccount extends Account {
    private double profit = 0.1;

    public SavingAccount(MyDate openingAccunt) {
        super(openingAccunt);
    }
}
