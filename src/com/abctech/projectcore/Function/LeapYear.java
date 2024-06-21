package com.abctech.projectcore.Function;

import java.util.Scanner;

public class LeapYear {
    /**
     * Write a Java method to check whether a year
     * (integer) entered by the user is a leap year or not
     * Expected output:
     * Input a year: 2017
     * false
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
LeapYear leapYear= new LeapYear();
        System.out.println("Enter a year ");
        int inputYear  = scanner.nextInt();
        System.out.println(leapYear.leapYearCheck(inputYear));

    }
    public boolean leapYearCheck(int year){

        return (year %4 ==0 );
    }
}
