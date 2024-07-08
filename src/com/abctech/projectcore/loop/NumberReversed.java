package com.abctech.projectcore.loop;

public class NumberReversed {
    public static void main(String[] args) {
          /*
    Write a program that prompts the user to input an integer and then outputs the number with  the digits reversed.
     For example, if the input is 12345, the output should be 54321.

     */

        int number=123456;
        int reversedNumber=0;
         while (number!=0){
             int digit = number % 10;
             System.out.print(digit);
//             reversedNumber =( reversedNumber * 10) + digit;
             number/=10;
         }


    }
}
