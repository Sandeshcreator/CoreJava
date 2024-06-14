package com.abctech.projectcore.condition;

import java.util.Locale;
import java.util.Scanner;

public class Eureka {
    public static void main(String[] args) {
        /*
        Number should be exactly divisible by 2
        The length of string should be between 5 to 10
        The string’s first letter should start from ‘a’ or ‘b’ or ‘s’ or ‘p’ regardless of case.
        It may be upper or lower case
        The string should not contain any of given characters ‘x’ or ’y’ or’ z’
        The number should be between 2 and 4 digits
        The number should always starts with odd digits
        Display “Eureka” if all conditions are matched !!!

         */

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a  num");
//        int userInputNumber= sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter word");
//        String userInputWord= sc.nextLine().toLowerCase();
//        if (userInputNumber%2==0 && userInputWord.length()>5 &&
//                userInputWord.length() <= 10 &&
//                userInputWord.charAt(0) == 'a' ||
//                userInputWord.charAt(0) == 'b' ||
//                userInputWord.charAt(0) == 's' ||
//                userInputWord.charAt(0) == 'p' &&
//                        userInputWord.contains("x,y, z")&&
//                        userInputNumber >= 10 && userInputNumber <= 9999 &&
//                        userInputNumber%2!=0
//        ) {
//            System.out.println("Eureka");
//
//        }else {
//            System.out.println("No Eureka");
//
//        }

//        System.out.println(2/2);
//        System.out.println(2%2);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int lastcondNumber = sc.nextInt();
        int sum = firstNumber + secondNumber + lastcondNumber;
        System.out.println((sum == 180) ? "The triangle is valid" : "The triangle is not valid");

/*
Take two values fromNumber and toNumber.
Your program should print based on following criteria
Both fromNumber and toNumber should be greater than or equal to 0.
If fromNumber is less than toNumber then print all the numbers from
 fromNumber to toNumber ; inclusive fromNumber and exclusive toNumber
If fromNumber is greater than toNumber, swap the numbers and perform
the same process as above.
 */
//        int fromNumber= sc.nextInt();
//        int toNumber= sc.nextInt();
//        if (fromNumber >0 &&toNumber>0 ){
//
//            if(fromNumber <toNumber ){
//
//            }
//
//        }





    }
}
