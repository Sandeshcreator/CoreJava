package com.abctech.projectcore.Loop;

public class ArmstrongNumbers {
    /**
     *  Write a program to print out all Armstrong numbers between 1 and 500.
     *  If the sum of cubes of  each digit of the number is equal to the number itself,
     *  then the number is called an  Armstrong number.
     */
    public static void main(String[] args) {

            for (int i = 1; i < 500; i++) {
                int number = i;
                int result = 0;

                while (number > 0) {
                    int digit = number % 10;
                    result += digit * digit * digit;
                    number /= 10;
                }

                if (result == i) {
                    System.out.println(i + " is an Armstrong number");
                }
            }

    }
}
