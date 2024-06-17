package com.abctech.projectcore.Function;

import java.util.Scanner;

public class MultipleTablePrint {
    /**
     * 14. WAP to print the multiplication table of a number using a function printMultiplication(int inputNumber)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num  = scanner.nextInt();
        printMultiplication(num);

    }
    public static void printMultiplication(int inputNumber){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(inputNumber+ " * "+ i + " = " + (inputNumber*i));

        }
    }

}
