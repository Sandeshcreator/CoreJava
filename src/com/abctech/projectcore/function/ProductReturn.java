package com.abctech.projectcore.function;

import java.util.Scanner;

public class ProductReturn {
    /**
     * Define a method that returns the product of two numbers entered by the user.
     */

    public static void main(String[] args) {
        ProductReturn productReturn = new ProductReturn();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number to multiply");
        int numbOne = scanner.nextInt();
        System.out.println("Enter a second number to multiply");
        int numbTwo = scanner.nextInt();

        int proTwoNumber = productReturn.getProduct(numbOne,numbTwo);
        System.out.println( "Two number Product are : " + proTwoNumber);

    }

    public int getProduct(int numbOne , int numbTwo) {
        return (numbOne*numbTwo);
    }
}
