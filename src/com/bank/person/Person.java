package com.bank.person;

import com.bank.Date.MyDate;

public class Person {
    private String fullname ;
    private double phoneNumber;
    private MyDate birthdayDate ;

    public Person(){}
    public Person (String fullname, double phoneNumber) {
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setBirthdayDate(int day , int month , int year ){
        this.birthdayDate.setDay(day);
        this.birthdayDate.setMonth(month);
        this.birthdayDate.setYear(year);
    }
}
