package com.bank.Date;

public class MyDate {
    private int year ;
    private int month ;
    private int day ;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public boolean isValidDate (int year, int month, int day){
        boolean isValid = false;
        if (year <9999 && year>1){
            if (month<12 && month>0 ){
                if (day<31 && day>0 ){
                    isValid=true ;
                }
            }
        }
        return isValid;
    }

    public int getMonthLastDay(int month){
        int lastDay = -1 ;
        if (month<=6 ){
            lastDay=31;
        }
        else if (month>6 && month<=11){
            lastDay=30 ;
        }
        else if (month==12){
            lastDay=29;
        }
        else {
            System.out.println("wrong month number !");
        }
        return lastDay;
    }


    public void next (){
        if (getMonthLastDay(getMonth())!=getDay()+1){
            setDay(getDay()+1);
        }
        else {
            if (getMonthLastDay(getMonth())==getDay()+1 && getMonth()!=12 ){
                setDay(1);
                setMonth(getMonth()+1);
            }
            else {
                setMonth(1);
                setDay(1);
                setYear(getYear()+1);
            }
        }
    }
    Month months[] = Month.values();
    @Override
    public String toString() {
        for (Month item : months) {
            if (item.getNumber() == getMonth())
                return getDay() + " " + item + " " + getYear();
        }
        return null;
    }
}
