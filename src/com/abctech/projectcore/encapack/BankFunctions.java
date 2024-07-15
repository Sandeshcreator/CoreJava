package com.abctech.projectcore.encapack;

public class BankFunctions {

    BankAccount[] bankAccounts = new BankAccount[5];

    public void createBankAccount(String accountHolderName,
                                  String emailAddress,
                                  String mobileNumber,
                                  double initialBlance) {
        BankAccount newAccount = new BankAccount();
        newAccount.setAccountHolderName(accountHolderName);
        newAccount.setEmail(emailAddress);
        newAccount.setMobileNumber(mobileNumber);
        newAccount.setBalance(initialBlance);
        newAccount.setOverdraftAmount(1000);

        int newIndex = getAvailableIndexOfAccount();
        if (newIndex != 100) {
            bankAccounts[newIndex] = newAccount;
            System.out.println("Bank account created sucessfully !!!!!!!!!!");
        } else {
            System.out.println("Bank account limit ");
        }
    }

    public void displayAccountDetails() {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount != null) {
                System.out.println("----------------------");
                System.out.println("Account Holder Name " + bankAccount.getAccountHolderName());
                System.out.println("Account Holder Email " + bankAccount.getEmail());
                System.out.println("Account Holder Mobile Number " + bankAccount.getMobileNumber());
                System.out.println("Account Holder Current balance " + bankAccount.getBalance());
                System.out.println("----------------------");

            }
        }
    }


    public int getAvailableIndexOfAccount() {
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i] == null) {
                return i;
            }

        }
        return 100;

    }


    public double depositeAmount(double depositeAmount, String email, String mobileNumber) {
        int currentBankIndex = findBankAccountIndex(mobileNumber, email);
        if (currentBankIndex == 100) {
            System.out.println("not matched bank");
            return 0;
        } else {
            bankAccounts[currentBankIndex].setBalance
                    (bankAccounts[currentBankIndex].getBalance() + depositeAmount);
            return bankAccounts[currentBankIndex].getBalance();
        }

    }

    public double withdrawAmount(double withdrawAmount, String email, String mobileNumber) {
        int currentBankIndex = findBankAccountIndex(mobileNumber, email);
        if (currentBankIndex == 100) {
            System.out.println("not matched bank");
            return 0;
        } else {
            bankAccounts[currentBankIndex].setBalance
                    (bankAccounts[currentBankIndex].getBalance() - withdrawAmount);
            return bankAccounts[currentBankIndex].getBalance();
        }
    }

    public int findBankAccountIndex(String mobileNumber, String email) {
        int currentBankIndex = 100;
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i] != null) {
                if (bankAccounts[i].getMobileNumber().equals(mobileNumber) && bankAccounts[i].getEmail().equals(email)) {
                    currentBankIndex = i;
                    break;
                }
            }
        }
        return currentBankIndex;
    }
}












