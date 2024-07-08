package com.abctech.projectcore.function;

import java.util.Scanner;

public class IsPrime {
    /**
     * 12. WAP that check a prime number boolean checkPrime(int testNumber)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsPrime isPrime = new IsPrime();
        System.out.print("Enter a number :");
        int testNumber  = scanner.nextInt();
        boolean primeNumberCheck = isPrime.checkPrime(testNumber);
        if (primeNumberCheck){
            System.out.println("Number u Entered is prime");
        }else {
            System.out.println("Number u Entered is not prime");

        }
    }

    private boolean checkPrime(int testNumber){
        for (int i = 2; i <testNumber ; i++) {
            if (testNumber%i==0) {
                return false;
            }
        }
        return true;
    }
}
