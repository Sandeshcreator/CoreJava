package com.abctech.projectcore.exceptions;

import java.util.Scanner;

public class ArthIllegalEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        try {
            if (userInput < 0) {
                throw new IllegalArgumentException("Negative input not allowed");
            }
            System.out.println(20 / userInput);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("haha");
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("hehe");
            System.out.println(illegalArgumentException.getMessage());
        }
    }
}
