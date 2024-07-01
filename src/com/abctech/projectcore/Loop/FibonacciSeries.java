package com.abctech.projectcore.Loop;

public class FibonacciSeries {
    /**
     * 14. Write a program to print Fibonacci series of n terms where n
     * is input by user : Example Output : 0 1 1 2 3 5 8 13 24 .....
     */
    public static void main(String[] args) {
        int firstNumb=0;
        int secondNumb=1;

        System.out.print(firstNumb + " " + secondNumb + " ");

        for (int i = 1; i <10 ; i++) {
            int result = firstNumb+secondNumb;

            System.out.print(result + " ");

            firstNumb=secondNumb;
            secondNumb=result;
        }


    }


}
