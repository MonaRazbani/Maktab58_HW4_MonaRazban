package com.bank.person;

public class Manager extends Person{
    private String userName ;
    private String password ;

    public Manager(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

