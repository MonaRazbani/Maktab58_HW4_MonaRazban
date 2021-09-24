package com.bank;
import com.bank.*;
import com.bank.Date.MyDate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter username & password : ");
        String username = scanner.next();
        String password = scanner.next();

        System.out.println("enter day , month ,year of today :");
        int day =scanner.nextInt();
        int month=scanner.nextInt();
        int year= scanner.nextInt();
        MyDate date = new MyDate(year,month,day );

       if (bank.IsAdmin(username,password)){
           uoter: while (true){
               System.out.println("1. Add new account\n 2. View accounts\n 3. Withdraw \n4." +
                                   " Deposit \n5. Calculate interests\n 6. View Transactions \n7. Exit\n");
               int type = scanner.nextInt();
               switch (type){
                   case 1 :{
                       System.out.println("enter name & phoneNumber ");
                       String name = scanner.next();
                       double phoneNumber =scanner.nextDouble();
                       bank.addAccount(name,phoneNumber,date);
                       break ;

                   }
                   case 2: {
                       bank.ShowAccounts();
                       break ;
                   }
                   case 3 :{
                       bank.withdrawMoney();
                       break ;
                   }
                   case 4:{
                       bank.deposit();
                       break ;
                   }
                   case 5:{
                       //todo
                   }
                   case 6:{
                       //todo

                   }
                   case 7:{
                       break uoter;
                   }
                   default:{
                       System.out.println("wrong number ");
                       break ;
                   }
               }

           }
       }

    }
}
