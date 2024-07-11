package com.abctech.projectcore.encapack;

import java.io.IOException;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        BankReaderClass brc = new BankReaderClass();
        BankFunctions bankFunctions = new BankFunctions();

        while (isRunning) {
            System.out.println("1 Create Account");
            System.out.println("2 Display Account Details");
            System.out.println("3 Deposit");
            System.out.println("4 Withdraw");
            System.out.println("5 Check BAlance");
            System.out.println("6 Exit");
            System.out.println("-------------Enter your choice------------");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BankAccount ba = brc.readNewAccountDetails();
                    bankFunctions.createBankAccount(ba.getAccountHolderName(),
                            ba.getEmail(),
                            ba.getMobileNumber(),
                            ba.getBalance());

                    break;
                case 2:
                    bankFunctions.displayAccountDetails();
                    break;
                case 3:
                    System.out.println("Under dev");

                    break;
                case 4:
                    System.out.println("Under dev");

                    break;
                case 5:
                    System.out.println("Under dev");

                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("invalid ");
            }
        }
    }
}
