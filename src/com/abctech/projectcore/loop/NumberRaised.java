package com.abctech.projectcore.loop;

import java.util.Scanner;

public class NumberRaised {
    /**
     * 5. Two numbers are entered through the keyboard.
     * Write a program to find the value of one  number raised to the power of another.
     * (Do not use Java built-in method)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base:");
        int base = scanner.nextInt();

        System.out.println("Enter the exponent:");
        int exponent = scanner.nextInt();
        
        int result=1;

        for (int i = 1; i <=exponent; i++) {
            result *= base;
        }
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result);


    }


}
