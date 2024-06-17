package com.abctech.projectcore.Function;

import java.util.Scanner;

/**
 * Write a program to print the circumference
 * and area of a circle of radius entered by the user by defining your own method.
 */
public class CircleCalculator {


    public static void main(String[] args) {
        CircleCalculator calculator = new CircleCalculator();

        calculator.printCircumferenceAndArea();
    }




    public double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public void printCircumferenceAndArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}