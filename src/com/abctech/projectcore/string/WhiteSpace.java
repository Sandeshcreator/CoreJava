package com.abctech.projectcore.string;

import java.util.Scanner;

public class WhiteSpace {
    public static void main(String[] args) {
        /*
        Write a program to find the number of white spaces used in a string.
         */
        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();
         int count = 0;

         for (int i = 0; i < input.length(); i++) {
             if (input.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}
