package com.abctech.projectcore.string;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsPrint {
    /**
     * Write a program that takes a string input and find distinct characters
     * in string and keep it in
     * array. Eg : apple The array should contain ‘apple’ only and print it.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();
        if (userInput.contains("apple")){
            String[] arr = new String[]{"apple"};
            System.out.println(arr);

        }

    }



}
