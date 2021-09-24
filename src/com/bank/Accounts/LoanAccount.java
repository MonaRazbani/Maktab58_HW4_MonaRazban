package com.bank.Accounts;

import com.bank.Date.*;
import com.bank.person.*;

import java.util.Arrays;


public class LoanAccount extends Account{
        private double Interest;
        private double loan ;
        private int periodTime ;
        private boolean[] payment = new boolean[periodTime-1];
        private Account bank ;
        private double amountOfEachLoan ;
        private int numOfLoansPaid=0 ;

        public LoanAccount( MyDate openingAccunt, double interest, double loan, int periodTime) {
            super(openingAccunt);
            Interest = interest;
            this.loan = loan;
            this.periodTime = periodTime;
            amountOfEachLoan=(loan+loan*interest)/periodTime;
        }

        public double getInterest() {
            return Interest;
        }

        public void setInterest(double interest) {
            Interest = interest;
        }

        public double getLoan() {
            return loan;
        }

        public void setLoan(double loan) {
            this.loan = loan;
        }

        public int getPeriodTime() {
            return periodTime;
        }


    public boolean[] getPayment() {
            return payment;
        }

        public void setPayment(int index , boolean paid) {
            this.payment [index]= paid;
        }

        public Account getBank() {
            return bank;
        }

        public double getAmountOfEachLoan() {
            return amountOfEachLoan;
        }

        public int getNumOfLoansPaid() {
            return numOfLoansPaid;
        }

        public void setNumOfLoansPaid() {
            this.numOfLoansPaid ++;
        }

    @Override
    public void withdrawMoney( double amountMoney ) {
    super.withdrawMoney(amountMoney);
    }

    public void loanRepayment(MyDate date){
            if(getOpeningAccunt().getDay()==date.getDay()) {
                if (getAmountOfEachLoan() < getBalance()) {
                    withdrawMoney( getAmountOfEachLoan());
                    setPayment(getNumOfLoansPaid(), true);
                    setNumOfLoansPaid();
                } else {
                    System.out.println("account balance is not enough");
                    setPayment(numOfLoansPaid, false);
                    setNumOfLoansPaid();
                }
            }
            else System.out.println("The loan has not been repaid");

    }

    @Override
    public Double calculateInterests() {
            return getLoan()*getInterest();

    }

    @Override
    public String toString() {
        return "Type : LoanAccount" + super.toString()+
                "Interest :" + Interest +
                " loan :" + loan +
                " periodTime :" + periodTime +
                " payment :" + Arrays.toString(payment) +
                " amountOfEachLoan :" + amountOfEachLoan +
                " Paid :" + numOfLoansPaid +
                '}';
    }

    }
