package com.abctech.projectcore.Arrays;

import java.util.Scanner;

public class LargerSmaller {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a size u want");
        int size =  userInput.nextInt();
        int num[] = new int[size];
        int max=0;
        int min=0;

        System.out.println("Enter a number till" + size);
        for (int i = 0; i <num.length; i++) {
            num[i]=userInput.nextInt();
            max=num[0];
            min=num[0];
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

    }
}
