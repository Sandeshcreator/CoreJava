package com.abctech.projectcore.condition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter a second number");
        int secondNumber = sc.nextInt();
        /*
        Write a java program to accept two integers and
        check whether they are equal or not.
         */
        if (firstNumber == secondNumber) {
            System.out.println("Its equal");
        } else {
            System.out.println("Its not");
        }
        /*
        Write a java program to check if the input number is even or odd.
         */
        System.out.println("Now firstnumber is going to check for odd or even");
        if (firstNumber % 2 == 0) {
            System.out.println("firstnumber is even");
        } else {
            System.out.println("firstnumber is odd");
        }
        /*
        WAP to check if a number is positive or not.
         */
        System.out.println("Now secondNumber is going to check for positive or not");
        if (secondNumber > 0) {
            System.out.println("secondNumber is positive");
        } else if (secondNumber < 0) {
            System.out.println("secondNumber is negative");

        } else {
            System.out.println("Zero");
        }


        /*
        WAP to take the person’s height in feet and convert it into centimeters and
        display it. Also say you are tall if the height in centimeters is greater
        than 160 cm else not tall.

        30.48
         */
        float centimeterConverterRate = 30.48f;
        float centimeterConverter = firstNumber * centimeterConverterRate;
        System.out.println("your height in cm is " + (centimeterConverter));
        if (centimeterConverter > 160) {
            System.out.println("U are tall");
        } else {
            System.out.println("U are not tall");
        }

        /*
        +x +y  Q1
-x  +y  Q2
-x   -y  Q3
+x  -y  Q4

         */
        if (firstNumber > 0 && secondNumber > 0) {
            System.out.println(" +x +y");
        } else if (firstNumber < 0 && secondNumber > 0) {
            System.out.println("-x  +y");
        } else if (firstNumber < 0 && secondNumber < 0) {
            System.out.println("-x  -y");
        } else if (firstNumber > 0 && secondNumber < 0) {
            System.out.println("+x  -y");
        }




        /*
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || c == a) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
         */


        //        a.	Show 5 options to user
//        i.	CREATE , READ , UPDATE , DELETE
//        ii.	Let user choose any one of the option
//        iii.	Under every option ask user the number of times
//        iv.	Print the option name to the number of times that user enters.
//        v.	If a user enters the option which is not in the option list display
//        TRY AGAIN !!
        System.out.println("CREATE , READ , UPDATE , DELETE");
        String userInputs=sc.nextLine();
        int inputs=0;
        int i ;
        System.out.println("Number u want to see " + userInputs);
        inputs= sc.nextInt();
        switch (userInputs) {
            case "CREATE":
                for ( i = 0; i <inputs ; i++) {
                    System.out.println("CREATE");
                }
                break;
            case "READ":
                for ( i = 0; i <inputs ; i++) {
                    System.out.println("READ");
                }
                break;
            case "UPDATE":
                for ( i = 0; i <inputs ; i++) {
                    System.out.println("UPDATE");
                }
                break;
            case "DELETE":
                for ( i = 0; i <inputs ; i++) {
                    System.out.println("DELETE");
                }
                break;
            default:
                System.out.println("  TRY AGAIN !!");
        }

    }
}
