package com.abctech.projectcore.condition;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper limit:");
        int upperLimit = scanner.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 1; i <= upperLimit; i++) {
            if (oddEven.isEven(i)){
                sumEven+=i;

            }else {
                sumOdd+=i;
            }


        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
