package com.abctech.projectcore.function;

import java.util.Scanner;

public class NumberLength {
    /**
     * 15. WAP a java program that takes a number and returns the length of the number.
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberLength numberLength=new NumberLength();

        System.out.println("Enter a number ");
        int num  = scanner.nextInt();

        System.out.println(numberLength.numberLength(num));


    }

    public int numberLength(int numb){
//   while (count!=0){
//
//   }
   int count=0;

        while (numb!=0){
            int digit = numb % 10;
              count++;
//             reversedNumber =( reversedNumber * 10) + digit;
            numb/=10;
        }
        return count;
    }

}
