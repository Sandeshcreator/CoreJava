package com.abctech.projectcore.Function;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VoteEligible voteEligible = new VoteEligible();
         System.out.print("Enter your age: ");
        int ageInput = scanner.nextInt();
        boolean eligible = voteEligible.isEligibleToVote(ageInput);
        if (eligible) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }


    public boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
