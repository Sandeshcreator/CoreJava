package com.abctech.projectcore.string;

import java.util.Scanner;

public class Last {
    public static void main(String[] args) {
        /*
       Write a program to take a string input and display its length and last character.
         */
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();


        char lastCharacter = input.charAt(input.length() - 1);
        System.out.println("Last character of the string: " + lastCharacter);



    }
}
