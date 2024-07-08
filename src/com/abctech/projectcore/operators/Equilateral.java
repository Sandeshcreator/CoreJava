package com.abctech.projectcore.operators;

import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number :");
        int firstNum = scanner.nextInt();
        System.out.println("Enter a second number :");
        int secondNum = scanner.nextInt();
        System.out.println("Enter a third number :");
        int thirdNum = scanner.nextInt();

        if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("Equilateral  true");

        } else {
            System.out.println("Equilateral false");

        }
    }
}
