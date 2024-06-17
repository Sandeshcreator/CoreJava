package com.abctech.projectcore.Function;

import java.util.Scanner;

public class Area {
    /**
     * 26. Write a method to find the area of a circle.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius  circle: ");
        double radius = scanner.nextDouble();
   System.out.println("The area of the circle: " + calculateArea(radius));
    }

    public static double calculateArea(double radius) {
         return Math.PI * radius * radius;
    }
}
