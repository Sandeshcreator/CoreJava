package com.abctech.projectcore.constructor.bank;

public class Bank {
    /**
     * Create a class named Bank which should contain the following data members [state]
     * id  Long
     * bankName String
     * baseInterestRate Double
     * numberOfBranch Integer
     * headOfficeAddress String
     * bankCategory String
     */
    private long id;
    private String bankName;
    private Double baseInterestRate;
    private int numberOfBranch;
    private String headOfficeAddress;
    private String bankCategory;

    public Bank(){

    }

    public Bank(long id, String bankName, Double baseInterestRate, int numberOfBranch, String headOfficeAddress, String bankCategory) {
        this.id = id;
        this.bankName = bankName;
        this.baseInterestRate = baseInterestRate;
        this.numberOfBranch = numberOfBranch;
        this.headOfficeAddress = headOfficeAddress;
        this.bankCategory = bankCategory;
    }

    /**
     * function in bank class which should display all the data members inside a bank in following format
     * BANK  ID : 1
     * BANK NAME : GLOBAL BANK
     * BASE INTEREST RATE : 20 %
     * NUMBER OF BRANCH : 100
     * HEAD OFFICE ADDRESS : TEXAS
     * BANK CATEGORY : A CATEGORY
     */
    public void display() {
        System.out.println("BANK ID : " + id);
        System.out.println("BANK NAME : " + bankName);
        System.out.println("BASE INTEREST RATE : " + baseInterestRate + " %");
        System.out.println("NUMBER OF BRANCH : " + numberOfBranch);
        System.out.println("HEAD OFFICE ADDRESS : " + headOfficeAddress);
        System.out.println("BANK CATEGORY : " + bankCategory);
    }
}
