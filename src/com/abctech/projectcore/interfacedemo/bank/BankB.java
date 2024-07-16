package com.abctech.projectcore.interfacedemo.bank;

public class BankB implements Bank {
    private double balance;

    public BankB(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
