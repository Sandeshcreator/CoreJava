package com.abctech.projectcore.operators;

import java.util.Scanner;

public class PertimeterRectagle {
    /**
     * Write a Java program to print the area and perimeter of a rectangle.
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a length number :");
        int length= scanner.nextInt();
        System.out.println("Enter a width number :");
        int width= scanner.nextInt();

        if (length>0 && width>0 ) {
            System.out.println("The perimeter of the rectangle is: " + 2 * (length + width));
        }else {
            System.out.println("Invalid Input");
        }
    }
}
