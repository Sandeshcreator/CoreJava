package com.abctech.projectcore.function;

import java.util.Scanner;

public class DisplayAllNumber {
    /**
     * 10. WAP that displays all the numbers from range void display(int start , int end)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DisplayAllNumber displayAllNumber = new DisplayAllNumber();
        System.out.println("Enter a first number to start");
        int start  = scanner.nextInt();
        System.out.println("Enter a second  number  end");
        int end  = scanner.nextInt();
        displayAllNumber.display(start, end);
    }



    public void display(int start , int end){
        int i = start;
        while (i<=end){
            System.out.print( i+" ");
            i++;

        }
    }
}
