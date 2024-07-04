package com.abctech.projectcore.Recursion;

import java.util.Scanner;

public class Factorial {
    /**
     * Write a method to find factorial using recursion.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        System.out.println(fact(userInput));

    }
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

}
