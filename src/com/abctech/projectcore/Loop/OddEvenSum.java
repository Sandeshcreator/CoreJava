package com.abctech.projectcore.Loop;

public class OddEvenSum {
    public static void main(String[] args) {
        /*
        Write a program that reads a range of numbers as input,
         and iterates it then prints the sum of the even and odd  integers.
         */
        int oddSum =0;
        int evenSum=0;
        for (int i = 1; i <=10 ; i++) {
            if (i %2==0) {
                evenSum=i+evenSum;
            }else {
                oddSum=i+oddSum;
            }

        }

        System.out.println("Sumt of even is " +evenSum);
        System.out.println("Sumt of odd is "  +oddSum);
    }
}
