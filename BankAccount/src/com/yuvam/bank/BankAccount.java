package com.yuvam.bank;

import java.util.Objects;

public class BankAccount {

    public int balance;
    public String name;
    public String type;
    public double interestRate;

    public BankAccount(){
        this.balance = 0;
        this.name = "";
        this.type= "Checking";
        this.interestRate = 2.0;
    }

    public BankAccount(int balance, String name, String type, double interestRate){
        this.balance = balance;
        this.name = name;
        this.type= type;
        this.interestRate = interestRate;
    }

    public BankAccount(BankAccount bankAccount2){
        this.balance=bankAccount2.balance;
        this.name= bankAccount2.name;
        this.type=bankAccount2.type;
        this.interestRate=bankAccount2.interestRate;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
