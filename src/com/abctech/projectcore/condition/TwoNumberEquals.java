package com.abctech.projectcore.condition;

import java.util.Scanner;

public class TwoNumberEquals {
    /**
     * Write a java program to accept two integers and check whether they are equal or not.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNum = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNum =  scanner.nextInt();

        System.out.println((secondNum == firstNum) );

        }

    }

