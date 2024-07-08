package com.abctech.projectcore.loop;

import java.util.Scanner;

public class Factorial {
    /**
     * 	5 X 4 X 3 X 2 X 1 = 120
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number u want of Factorial:");
        int userInput = scanner.nextInt();
        int factTotal = 1;
        int i= userInput;
        while (i>=1){
            factTotal*=i;
            i--;
        }
        System.out.println(factTotal);

    }
}
