package com.abctech.projectcore.function;

import java.util.Scanner;

public class OddNumbersDisplay {

    /**
     * 11. WAP that displays all the odd numbers from range void displayOddNumbers(int start , int end)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OddNumbersDisplay oddNumbersDisplay = new OddNumbersDisplay();
        System.out.println("Enter a first number to start");
        int start  = scanner.nextInt();
        System.out.println("Enter a second  number  end");
        int end  = scanner.nextInt();
        oddNumbersDisplay.displayOddNumbers(start, end);
    }

    public void displayOddNumbers(int start , int end){
        System.out.print("odd numbers are: ");

        for (int i = start; i <=end; i++) {
            if (i%2!=0) {
                System.out.print(i +" ");
            }
        }


    }

}
