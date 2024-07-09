package com.abctech.projectcore.string;

import java.util.Scanner;

public class SpecialCharacters {
    /**
     *Write a program to find the special characters in the string. Special characters includes
     *!@#$
     * %^&*()”:>? sur$$$tttt@#$%
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();
        String specialCharacters = "!@#$%^&*()\":>?";


        for (int i = 0; i <input.length() ; i++) {
            char ch = input.charAt(i);
            if (specialCharacters.indexOf(ch) != -1){
                System.out.println("it contains special char" + i);
            }
        }
    }
}
