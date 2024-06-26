package com.abctech.projectcore.Operators;

import java.util.Scanner;

public class FiveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double firstNum = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double secondNum = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double thirdNum = scanner.nextDouble();

        System.out.println("Enter the fourth number:");
        double fourthNum = scanner.nextDouble();

        System.out.println("Enter the fifth number:");
        double fifthNum = scanner.nextDouble();


        double total = firstNum + secondNum + thirdNum + fourthNum + fifthNum;
        double average = total / 5;


        System.out.println("The average of the five numbers is: " + average);

    }
}
