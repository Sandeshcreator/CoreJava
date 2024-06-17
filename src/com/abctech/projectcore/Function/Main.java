package com.abctech.projectcore.Function;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//sum three
        SumThree sumThree = new SumThree();
        System.out.println("Enter a first number ");
        int num1  = scanner.nextInt();
        System.out.println("Enter a second  number ");
        int num2  = scanner.nextInt();
        System.out.println("Enter a third number ");
        int num3 = scanner.nextInt();

        System.out.println("Total of sum three is " +sumThree.sum(num1, num2, num3));



    }
}
