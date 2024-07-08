package com.abctech.projectcore.loop;

import java.util.Scanner;

public class CountPositiveNegative {
    /**
     * Write a program to enter the numbers
     * till the user wants and at the end it should display the  count of positive,
     * negative and zeros entered.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumber = 0, negativeNumber=0, zerosNumber=0;

        char choice;
        do {
            System.out.println("Enter a number:");
            int userInput = scanner.nextInt();

            if (userInput > 0) {
                positiveNumber++;
            } else if (userInput < 0) {
                negativeNumber++;
            } else {
                zerosNumber++;
            }

            System.out.println("Do you want to enter another number? (y/n)");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println(positiveNumber);
        System.out.println(negativeNumber);
        System.out.println(zerosNumber);

    }
}