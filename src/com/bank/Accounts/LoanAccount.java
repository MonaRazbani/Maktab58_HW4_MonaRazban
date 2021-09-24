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
    public void withdrawMoney(Account origin , double amountMoney ) {

        if (origin.getBalance() - amountMoney > 10000) {
            origin.setBalance(origin.getBalance() - amountMoney);
        }
        else System.out.println("Lack of inventory \n not done  ");
    }

    public void loanRepayment(LoanAccount loanAccount,MyDate date){
            if(loanAccount.getOpeningAccunt().getDay()==date.getDay()) {
                if (loanAccount.getAmountOfEachLoan() < loanAccount.getBalance()) {
                    withdrawMoney(loanAccount, loanAccount.getAmountOfEachLoan());
                    loanAccount.setPayment(getNumOfLoansPaid(), true);
                    loanAccount.setNumOfLoansPaid();
                } else {
                    System.out.println("account balance is not enough");
                    loanAccount.setPayment(numOfLoansPaid, false);
                    loanAccount.setNumOfLoansPaid();
                }
            }
            else System.out.println("The loan has not been repaid");

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
