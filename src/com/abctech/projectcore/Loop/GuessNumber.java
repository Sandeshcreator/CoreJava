package com.abctech.projectcore.Loop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    /**
     * 16. Write a program that generates a random number and asks the user to guess what the  number is.
     * If the user's guess is higher than the random number, the program should display"Too high, try again."
     * If the user's guess is lower than the random number, the program  should display "Too low, try again."
     * The program should use a loop that repeats until the  user correctly guesses the random number.
     */

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10);

        System.out.println(randomNumber);

        int n;

        do {
            System.out.println("enter Number");

             n= scanner.nextInt();
            if (randomNumber > n) {
                System.out.println("Too low, try again");
            }else if (randomNumber <n){
                System.out.println("Too high, try again");
            }else {
                System.out.println("matched, bye");
            }

        }while (randomNumber!=n);
    }
}
