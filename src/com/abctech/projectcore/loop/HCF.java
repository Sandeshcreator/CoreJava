package com.abctech.projectcore.loop;

import java.util.Scanner;

public class HCF {
    //9. Write a program to calculate HCF of Two given numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputOne = scanner.nextInt();
        int userInputTwo = scanner.nextInt();
        int  hcf = 0;
        for (int i = 1;  i <= userInputOne &&  i <= userInputTwo; i++) {
            if (userInputOne%i==0 && userInputTwo%i==0){
                hcf = i;
            }
        }
        System.out.println("HCF of given two numbers is ::"+hcf);

    }
}
