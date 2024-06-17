package com.abctech.projectcore.Function;

import java.util.Scanner;

public class MinimunMaximumNumber {
    /**
     * 18. Define two methods to print the maximum and minimum number respectively among three numbers entered by the user.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinimunMaximumNumber minimunMaximumNumber= new MinimunMaximumNumber();

        System.out.println("Enter a first number ");
        int num1  = scanner.nextInt();
        System.out.println("Enter a second  number ");
        int num2  = scanner.nextInt();
        System.out.println("Enter a third number ");
        int num3 = scanner.nextInt();

        minimunMaximumNumber.maximumNumber(num1, num2, num3);
        minimunMaximumNumber.minimumNumber(num1, num2, num3);


    }
    public void maximumNumber(int num1 , int num2 , int num3){
        int maxNumber= num3;
        if (num1 >= num2 && num1 >= num3) {
            maxNumber = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maxNumber = num2;
         }
        System.out.println("highest is " + maxNumber);

    }
    public void minimumNumber(int num1 , int num2 , int num3){
        int miniNumber= num3;
        if (num1 <= num2 && num1 <= num3) {
            miniNumber = num1;
         } else if (num2 <= num1 && num2 <= num3) {
            miniNumber = num2;
        }
        System.out.println("lowest is " + miniNumber);


    }


}
