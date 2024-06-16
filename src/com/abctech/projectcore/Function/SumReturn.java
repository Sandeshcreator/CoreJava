package com.abctech.projectcore.Function;

import java.util.Scanner;

public class SumReturn {
    /**
     * Write a program with a method named getTotal that accepts two integers
     * as an argument and return its sum. Call this method from main( )
     * and print the results.
     */
    public static void main(String[] args) {
        SumReturn sumReturn = new SumReturn();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number to sum");
        int numbOne = scanner.nextInt();
        System.out.println("Enter a second number to sum");
        int numbTwo = scanner.nextInt();

        int sumTwoNumber = sumReturn.getTotal(numbOne,numbTwo);
        System.out.println( "Two number sum are : " + sumTwoNumber);

    }


    public int getTotal(int numbOne , int numbTwo) {
        return (numbOne+numbTwo);
    }
}
