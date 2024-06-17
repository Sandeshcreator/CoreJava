package com.abctech.projectcore.Function;

import java.util.Scanner;

public class OddEvenCheck {
    /**
     * 9. WAP to check whether a number is even or odd using function.
     * The function name should be isEven(int parameter), which returns true if the number is even and return false if the number is  odd.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OddEvenCheck oddEvenCheck = new OddEvenCheck();
        System.out.print("Enter your number: ");
        int parameterInput = scanner.nextInt();
        System.out.println(oddEvenCheck.isEven(parameterInput));

    }



    public  boolean isEven(int parameter){
        return (parameter%2==0) ;
}
}
