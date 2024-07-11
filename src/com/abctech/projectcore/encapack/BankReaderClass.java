package com.abctech.projectcore.encapack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankReaderClass {
    BufferedReader bufferedReader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

    public BankAccount readNewAccountDetails() throws IOException {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Enter your name");
        bankAccount.setAccountHolderName(bufferedReader.readLine());
        System.out.println("Enter email address");
        bankAccount.setEmail(bufferedReader.readLine());
        System.out.println("Enter your mobile Number");
        bankAccount.setMobileNumber(bufferedReader.readLine());
        System.out.println("Enter account opening balance");
        bankAccount.setBalance(Double.parseDouble(bufferedReader.readLine()));

        return bankAccount;


    }
}
