package com.abctech.projectcore.Loop;

import java.util.Scanner;

public class MultiplicationWhile {
    /**
     * 3. Write a program that prompts the user to input a positive integer.
     * It should then print the  multiplication table of that number both using for and while loop.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number u want of multiplication while");
        int userInput = scanner.nextInt();
        int i= 1;
        while (i<=10){
            System.out.println(userInput + " X " + i+ " = " +(i*userInput));
            i++;
        }
    }
}
