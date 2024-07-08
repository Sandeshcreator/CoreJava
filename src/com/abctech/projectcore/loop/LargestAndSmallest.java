package com.abctech.projectcore.loop;

import java.util.Scanner;

public class LargestAndSmallest {
    /**
     * 12. Write a program to enter the numbers till the user wants and at the end the program should
     * display the largest and smallest numbers entered.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0, smallest=0;

        char choice;
        do {
            System.out.println("Enter a number:");
            int userInput = scanner.nextInt();

            if (userInput > largest) {
               largest=userInput;
            } else {
                smallest=userInput;
            }

            System.out.println("Do you want to enter another number? (y/n)");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println(largest);
        System.out.println(smallest);
    }
}
