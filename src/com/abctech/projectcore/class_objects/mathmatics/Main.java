package com.abctech.projectcore.class_objects.mathmatics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        // Consume the newline character left by nextInt()
        scanner.nextLine();

        Complex complex = new Complex(num1, num2);
        String inputplay;

        do {
            System.out.println("\nEnter an operation (ADD, DIFF, PROD):");
            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "ADD":
                    System.out.println("Sum: " + complex.sum());
                    break;
                case "DIFF":
                    System.out.println("Difference: " + complex.difference());
                    break;
                case "PROD":
                    System.out.println("Product: " + complex.product());
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }

            System.out.println("\nDo you want to play again? (y/n)");
            inputplay = scanner.nextLine();

        } while (inputplay.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}
