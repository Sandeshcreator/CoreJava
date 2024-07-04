package com.abctech.projectcore.Recursion;

import java.util.Scanner;

public class GCD {
    /**
     * Write a method to find gcd using recursion.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        int userInputTwo = scanner.nextInt();

        System.out.println(gdc(userInput,userInputTwo));

    }
    static int gdc(int a, int b) {
        if (a%b==0) {
            return b;
        } else {
            return gdc(b,a%b);

        }

    }
}
