package com.abctech.projectcore.interfacedemo.bank;

public class BankA implements Bank {
    private double balance;

    public BankA(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
