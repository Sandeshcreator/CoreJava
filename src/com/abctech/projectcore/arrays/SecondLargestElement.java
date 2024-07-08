package com.abctech.projectcore.arrays;

import java.util.Scanner;

public class SecondLargestElement {
    /* Second largest element in the array
     */

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a size u want");
        int size = userInput.nextInt();
        int num[] = new int[size];
        int max = 0;
        int secondMax = 0;


        System.out.println("Enter a number till" + size);
        for (int i = 0; i < num.length; i++) {
            num[i] = userInput.nextInt();
            if (num[i] > max) {
                secondMax = max;
                max = num[i];
            } else if (num[i] > secondMax && num[i] != max) {
                secondMax = num[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("secondMax number: " + secondMax);
    }


}
