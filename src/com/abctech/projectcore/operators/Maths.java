package com.abctech.projectcore.operators;

import java.util.Scanner;

public class Maths {


    public static void main(String[] args) {
        /**
         * Write a java program to take two number input from the user and
         *   display its sum,product,difference,quotient and remainder.
         *  Display invalid number as a message if any one of the numbers is less than or equals zero
         */
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a first number :");
        int firstNum= scanner.nextInt();
        System.out.println("Enter a second number :");
        int secondNum= scanner.nextInt();

        if (firstNum>0 && secondNum>0){
            System.out.println("Sum is " + (firstNum+secondNum));
            System.out.println("Difference is  " + (firstNum-secondNum));
            System.out.println("Product " + (firstNum*secondNum));
            System.out.println("Quotient " + (firstNum/secondNum));
            System.out.println("Remainder " + (firstNum%secondNum));
        }else {
            System.out.println("Invalid Input");
        }

    }
}
