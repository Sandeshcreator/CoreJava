package com.abctech.projectcore.exceptions;

import java.util.Scanner;

public class ThreeError {
    public static void main(String[] args) {
        //syntax error
        //int a = 23   // without ;

        //Runtime error
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt(); // we provide data that is not a integer

        // The intention might be to print double the user input
        // but there's a logical error in the computation
        int result = userInput / 2; // Logical error: should multiply by 2

        System.out.println("Double the number you entered is: " + result);
    }
}
