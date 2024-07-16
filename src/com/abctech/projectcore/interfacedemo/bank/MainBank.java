package com.abctech.projectcore.interfacedemo.bank;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a balance of bank A");
        Bank bankA = new BankA(scanner.nextDouble());

        System.out.println("Enter a balance of bank B");
        Bank bankB = new BankB(scanner.nextDouble());


        System.out.println("Enter a balance of bank C");
        Bank bankC = new BankC(scanner.nextDouble());

        System.out.println("Balance of bank A is RS: " + bankA.getBalance());
        System.out.println("Balance of bank B is RS: " + bankB.getBalance());
        System.out.println("Balance of bank C is RS: " + bankC.getBalance());


    }
}
