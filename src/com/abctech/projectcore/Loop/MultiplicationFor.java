package com.abctech.projectcore.Loop;

import java.util.Scanner;

public class MultiplicationFor {
    /**
     * 3. Write a program that prompts the user to input a positive integer.
     * It should then print the  multiplication table of that number both using for and while loop.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number u want of multiplication");
        int userInput = scanner.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(userInput + " X " + i+ " = " +(i*userInput));
        }

    }


}
