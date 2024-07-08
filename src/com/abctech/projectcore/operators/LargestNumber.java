package com.abctech.projectcore.operators;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        /**
         * Write a java program to find the largest number from the three numbers taken from the user.
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a first number :");
        int firstNum= scanner.nextInt();
        System.out.println("Enter a second number :");
        int secondNum= scanner.nextInt();
        System.out.println("Enter a third number :");
        int thirdNum= scanner.nextInt();

        if (firstNum>0 && secondNum>0 && thirdNum>0 ) {
         if (firstNum>secondNum && firstNum>thirdNum){
             System.out.println("Greater is first number " + firstNum);
         } else if (secondNum>firstNum && secondNum>thirdNum) {
             System.out.println("Greater is second number " + secondNum);
         }else {
             System.out.println("Greater is third number " + thirdNum);

         }

        }else {
            System.out.println("Invalid Input");
        }
    }
}
