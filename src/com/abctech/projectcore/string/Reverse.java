package com.abctech.projectcore.string;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        /*
        Write a program that takes the string input and reverse the string and display it.
         */
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));

        }
    }
}
