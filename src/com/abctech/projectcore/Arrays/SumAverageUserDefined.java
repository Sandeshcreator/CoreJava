package com.abctech.projectcore.Arrays;

import java.util.Scanner;

public class SumAverageUserDefined {
    /**
     * WAP to sum and average the elements of any array.
     * Size of the array should be defined by the user and also input should be provided by the user.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a size u want: ");

        int size = scanner.nextInt();
        int[] num = new int[size];
        int total = 0;


        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            num[i] = scanner.nextInt();

            total += num[i];
        }
        /*

        System.out.println("sum is : " + total + " and average is " + (total/size));
         */
        //improvement done by chat gpt
        double average = (double) total / size;
        System.out.println("Sum is: " + total + " and average is: " + average);


    }
}
