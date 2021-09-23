package com.bank.Accounts;

import com.bank.Date.*;
import com.bank.person.*;


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

        public void setNumOfLoansPaid(int numOfLoansPaid) {
            this.numOfLoansPaid = numOfLoansPaid;
        }

    }
