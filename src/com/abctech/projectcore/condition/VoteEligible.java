package com.abctech.projectcore.condition;

import java.util.Scanner;

public class VoteEligible {
    /**
     * WAP to check if a person is eligible to cast a vote or not.
     * PS. Make your own age bar for eligibility.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the your age:");
        int age = scanner.nextInt();
        System.out.println("If your age is greater than 18 than u are eligible but lets see ...");
        System.out.println(age>18 ? "u can" : "u can`t vote");

    }
}
