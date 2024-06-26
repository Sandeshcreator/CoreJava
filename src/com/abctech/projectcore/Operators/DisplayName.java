package com.abctech.projectcore.Operators;

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        /**
         * Write a program to take name input from the user and display Hello + name as output.
         */
        Scanner scanner= new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name );

    }
}
