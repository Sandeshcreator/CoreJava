package com.abctech.projectcore.Loop;

public class ReversrIntz {
    /**
     * 6. Write a program that prompts the user to input
     * an integer and then outputs the number with  the digits reversed.
     * For example, if the input is 12345, the output should be 54321.
     */
    public static void main(String[] args) {
        int number=153456;
        int reversedNumber=0;

        while (number!=0){
            int lastDigit=number%10;
            reversedNumber =(reversedNumber*10)+lastDigit;
            number=number/10;
        }
        System.out.print(reversedNumber);

    }
}

