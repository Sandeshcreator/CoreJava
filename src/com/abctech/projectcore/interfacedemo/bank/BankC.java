package com.abctech.projectcore.interfacedemo.bank;

public class BankC implements Bank {
    private double balance;

    public BankC(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
