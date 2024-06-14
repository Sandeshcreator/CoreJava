package com.abctech.projectcore.Arrays;

import java.util.Scanner;

public class UserEnterNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a size u want");
        int size =  userInput.nextInt();
        int num[] = new int[size];
        int total=0;
        System.out.println("Enter a number till" + size);
        for (int i = 0; i <num.length; i++) {
            num[i]=userInput.nextInt();
            total+=num[i];
       }
        System.out.println(total);


    }

}
