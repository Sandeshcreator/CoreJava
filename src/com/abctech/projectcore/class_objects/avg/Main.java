package com.abctech.projectcore.class_objects.avg;


import java.util.Scanner;

public class Main {
    /**
     * Print the average of three numbers entered by the user by creating a class
     * named 'Average' having a method to calculate and print the average.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter a second  number ");
        int num2 = scanner.nextInt();
        System.out.println("Enter a third number ");
        int num3 = scanner.nextInt();

        Average average = new Average(num1, num2, num3);
        System.out.println(average.getAverage());
    }
}
