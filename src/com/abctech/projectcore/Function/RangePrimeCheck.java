package com.abctech.projectcore.Function;

import java.util.Scanner;

public class RangePrimeCheck {
    /**
     *13. WAP that displays all the prime numbers between 1 and 1000. Use the above checkPrime function to identify the prime number.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RangePrimeCheck rangePrimeCheck = new RangePrimeCheck();
        System.out.print("Enter a number :");
        int testNumber  = scanner.nextInt();
        for (int i = 2; i <testNumber ; i++) {
            if (rangePrimeCheck.checkPrime(i)){
                System.out.println(i);
            }
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
