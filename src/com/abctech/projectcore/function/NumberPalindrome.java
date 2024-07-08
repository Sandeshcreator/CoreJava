package com.abctech.projectcore.function;

import java.util.Scanner;

public class NumberPalindrome {
    /**
     *21. Write a method that takes as input a nonnegative integer and returns true if
     *  the number is a palindrome; otherwise, it returns false. Also write a program to test your method.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberPalindrome numberPalindrome=new NumberPalindrome();

        System.out.println("Enter a number ");
        int num  = scanner.nextInt();

        System.out.println((numberPalindrome.numberLength(num))?"its palindrome": "its not palindrome");

    }

    public boolean numberLength(int numb){
        int orgiNumber=numb;
        int reversedNumber=0;

        while (numb!=0){
            int digit = numb % 10;
      reversedNumber =( reversedNumber * 10) + digit;
            numb/=10;
        }

        return (orgiNumber==reversedNumber);

    }
}
