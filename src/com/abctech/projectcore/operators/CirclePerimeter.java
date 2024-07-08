package com.abctech.projectcore.operators;

import java.util.Scanner;

public class CirclePerimeter {
    /**
     * Write a Java program to print the area and perimeter of a circle.
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a radius number :");
        double radius= scanner.nextInt();

        System.out.println("The perimeter of the circle is: " +  2 * Math.PI * radius);
    }
}
