package com.abctech.projectcore.Function;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        FactorialNumber factorialNumber = new FactorialNumber();
        int fact = factorialNumber.getFactorial(userNumber);
        System.out.println(fact);


    }
    public int getFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
