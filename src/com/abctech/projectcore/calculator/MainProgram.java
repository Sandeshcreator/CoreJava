package com.abctech.projectcore.calculator;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculatorFunction = new CalculatorFunction();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Enter the first number:");
            double numb1 = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double numb2 = scanner.nextDouble();

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("-------------Enter your choice------------");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculatorFunction.add(numb1, numb2));
                    break;
                case 2:
                    System.out.println("Result: " + calculatorFunction.sub(numb1, numb2));
                    break;
                case 3:
                    System.out.println("Result: " + calculatorFunction.multiply(numb1, numb2));
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + calculatorFunction.div(numb1, numb2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
