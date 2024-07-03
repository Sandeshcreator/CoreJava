package com.abctech.projectcore.Arrays;

import java.util.Scanner;

public class ReadElementFromUser {
    /**
     * WAP to create an integer array of size 10 , read the array elements from the user and
     * display the array elements.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            arr[i] = scanner.nextInt();
        }

        for (int display : arr) {
            System.out.println(display + " ");
        }
    }
}
