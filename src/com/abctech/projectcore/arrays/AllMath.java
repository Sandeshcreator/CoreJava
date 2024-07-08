package com.abctech.projectcore.arrays;

public class AllMath {
    /**
     * Create a array with elements
     * All the even numbers of an array
     * All the odd numbers of an array
     * All the prime numbers
     * All the negative numbers of an array
     * All the numbers exactly divisible by 5
     * Largest element in the array
     * Second largest element in the array
     * Sum of all the numbers
     * Sum of all the prime numbers
     * Copy all the negative numbers in separate array
     * Copy all the positive numbers in a separate array and increment every element by 10.
     */
    public static void main(String[] args) {
        int numb[] = {22, 52, 58, 96, 35, 2, 5, 8, 7, 5, 9, 5};

        String evenNumbers = "";
        String oddNumbers = "";

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] % 2 == 0) {
                evenNumbers += numb[i] + " ";
            } else {
                oddNumbers += numb[i] + " ";
            }
        }

        System.out.println("Even numbers are: " + evenNumbers);
        System.out.println("Odd numbers are: " + oddNumbers);


    }
}
