package com.abctech.projectcore.loop;

import java.util.Scanner;

public class PowerBase {
    public static void main(String[] args) {
        /*
        Two numbers are entered through the keyboard.
        Write a program to find the value of one  number raised to the power of another.
        (Do not use Java built-in method)
         */

        Scanner scanner= new Scanner(System.in);
        int base= scanner.nextInt();
        int exponent= scanner.nextInt();
        int result = 1;
        for (int i=1; i<=exponent; i++){
            result*=base;

        }
        System.out.println(result);
    }
}
