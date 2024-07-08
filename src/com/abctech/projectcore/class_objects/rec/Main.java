package com.abctech.projectcore.class_objects.rec;

import java.util.Scanner;

public class Main {
    /**
     * Write a program to print the area of a rectangle by creating a class named Rectangle
     * having two methods. First method named as 'setDim' takes length and breadth of
     * the rectangle as parameters and the second method named as 'getArea' returns the
     * area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());


    }
}
