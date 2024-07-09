package com.abctech.projectcore.string;

import java.util.Scanner;

public class LengthLast {
    /**
     * Write a program to take a string input and display its length and last character.
     */
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();  // Read the user input string

        int length = userInput.length();  // Get the length of the string
        char lastChar = userInput.charAt(length - 1);  // Get the last character of the string

        System.out.println("Length of the string: " + length);  // Print the length of the string
        System.out.println("Last character of the string: " + lastChar);  // Print the last character
    }
}
