package com.bank;
import com.bank.*;
import com.bank.Accounts.Account;
import com.bank.Accounts.CheckingAccount;
import com.bank.Accounts.LoanAccount;
import com.bank.Accounts.SavingAccount;
import com.bank.Date.MyDate;
import com.bank.person.Customer;
import com.bank.person.Manager;

import java.util.Scanner;

public class Bank {
    private Customer[] customers = new Customer[500];
    private int numOfCustomer = 0 ;
    private Account[] accounts= new Account[10000];
    private int NumOfAccount = 0;
    private Manager Admin = new Manager("admin", "123456789");

    public Manager getAdmin() {
        return Admin;
    }

    public int getNumOfCustomer() {
        return numOfCustomer;
    }

    public int getNumOfAccount() {
        return NumOfAccount;
    }

    public Customer getCustomers(int index ) {
        return customers[index];
    }

    public void setNumOfAccount() {
        NumOfAccount ++;
    }

    public void setNumOfCustomer() {
        this.numOfCustomer ++;
    }

    public boolean IsAdmin (String userName , String password ){
        if (getAdmin().getUserName().equals(userName)){
            if (getAdmin().getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public Customer addCustomer (String name ,double phoneNumber){
        customers[getNumOfCustomer()] =new Customer(name,phoneNumber);
        setNumOfCustomer();
        return customers[numOfCustomer-1];
    }
    public boolean isExistedCustomer (String name){
        boolean isExisted = false;
        for (int i=0 ; i< numOfCustomer+1; i++){
            if (customers[i].getFullname().toLowerCase().equals(name)){
                isExisted= true;
                break;
            }
        }
        return isExisted;
    }

    public Customer searchCustomer (String name){
        if (isExistedCustomer(name)){
            Customer getperson = new Customer();
            for (int i=0 ; i< numOfCustomer+1; i++) {
                if (customers[i].getFullname().equals(name)) {
                    getperson = customers[i];
                    break;
                }
            }
            return getperson;
        }
        else
            return null ;
    }

    public void addAccount (String name , double phoneNumber, MyDate openingAccunt ){
        Customer customer=new Customer();
        if(isExistedCustomer(name) ){
            int index = getNumOfCustomer();
            customer = addCustomer(name,phoneNumber);
        }
        else customer=searchCustomer(name);
        System.out.println("enter type of account: \n 1:checking account \n 2:loan account \n 3:saving Account ");
        Scanner scanner= new Scanner(System.in);
        int  type = scanner.nextInt();
        outer:switch (type){
            case 1 :{
                System.out.println("enter balance : ");
                double balance  = scanner.nextDouble();
                accounts[getNumOfAccount()]= new CheckingAccount(openingAccunt,balance);
                break;
            }
            case 2 : {
                System.out.println("enter interest & loan & periodTime : ");
                double interst = scanner.nextDouble();
                double loan =  scanner.nextDouble();
                int periodTime =scanner.nextInt();
                accounts[getNumOfAccount()]= new LoanAccount(openingAccunt,interst,loan,periodTime);
                break;
             }
            case 3 :{
                System.out.println("enter balance : ");
                double balance  = scanner.nextDouble();
                accounts[getNumOfAccount()]= new SavingAccount(openingAccunt,balance);
                break;
            }
            default: {
                System.out.println("wrong number");
                break outer;
            }

        }
        customer.setAccunt(accounts[getNumOfAccount()]);
        setNumOfAccount();
    }
}
