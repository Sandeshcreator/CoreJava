package com.abctech.projectcore.constructor.bank;

public class BankProgram {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Bank bankObject1 = new Bank(1, "GLOBAL BANK", 20.0, 100, "TEXAS", "A CATEGORY");
        bankObject1.display();

    }
}
