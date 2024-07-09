package com.abctech.projectcore.string;

import java.util.Scanner;

public class EqualString {
    /**
     * Write a program to take two string as input and check whether they are equal or not (Try
     * both equals and ignore case)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();

        System.out.println("Enter a second string:");
        String userInput2 = scanner.nextLine();

        if (userInput.equals(userInput2)){
            System.out.println("It is a exact equal");
        } else if (userInput.equalsIgnoreCase(userInput2)) {
            System.out.println("It is a exact equal but not checked lower or upper case");
        }else {
            System.out.println("It is not equal");
        }
    }
}
