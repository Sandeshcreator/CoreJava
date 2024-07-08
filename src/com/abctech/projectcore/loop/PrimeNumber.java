package com.abctech.projectcore.loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to input a positive integer.
         It should then output a  message indicating whether the number is a prime number.
         */
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();


        //
//        if (userInput >0) {
//            for (int i = 1; i <=userInput ; i++) {
//                if (i %1==0 && i %i==0 ) {
//                    System.out.println(i + " prime number");
//                }else {
//                    System.out.println(i+ " not prime");
//                }
//            }
//        }else {
//            System.out.println("number is 0 or less than 0");
//        }

        int count = 0;
        if (userInput > 0) {
            for (int i = 1; i <= userInput; i++) {
                if (userInput % i == 0) {
                    count++;
                }
            }
            if (count==2){
                System.out.println(  " prime");
            }else {
                System.out.println(" not prime");
            }
        } else {
            System.out.println("number is 0 or less than 0");
        }


    }
}
