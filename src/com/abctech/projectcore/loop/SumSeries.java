package com.abctech.projectcore.loop;

public class SumSeries {
    /**
     *  Write a program to calculate the sum of the following series where n is input by user.
     *  1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
     * where n is a positive integer and input by user.
     */

    public static void main(String[] args) {
        double result = 0.0;

        for (int i = 1; i <=5 ; i++) {
            result+=1.0/i;
        }
        System.out.println(result);
    }
}
