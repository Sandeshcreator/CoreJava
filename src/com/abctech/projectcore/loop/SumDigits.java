package com.abctech.projectcore.loop;

public class SumDigits {
    /**
     * 17. Write a program to find the sum of digits in a number. Example : 123 = (1+2+3) 18.
     */
    public static void main(String[] args) {
        int numb=123;
        int total=0;

        while (numb>0){
            int digits = numb%10;
            total+=digits;
            numb/=10;
        }
        System.out.println(total);
    }
}
