package com.bank.person;
import com.bank.Accounts.*;
public class Customer extends Person{
    private Account[] accunts =new Account[20];
    private int numOfAccount = 0;

    public Customer(){
        super();
    }
    public Customer(String fullname, double phoneNumber) {
        super(fullname, phoneNumber);
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

    public void setNumOfAccount() {
        this.numOfAccount++;
    }

    public void setAccunt (Account account){
        accunts[getNumOfAccount()]= account;
    }
}
