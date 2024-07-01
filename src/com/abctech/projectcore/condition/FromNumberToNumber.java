package com.abctech.projectcore.condition;

import java.util.Scanner;

public class FromNumberToNumber {
    /**
     * Take two values fromNumber and toNumber. Your program should print based on following criteria
     * Both fromNumber and toNumber should be greater than or equal to 0.
     * If fromNumber is less than toNumber then print all the numbers from
     * fromNumber to toNumber ; inclusive fromNumber and exclusive toNumber
     * If fromNumber is greater than toNumber, swap the numbers and perform the same process as above.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;

        System.out.println("Enter fromNumber:");
        int fromNumber = scanner.nextInt();

        System.out.println("Enter the toNumber:");
        int toNumber = scanner.nextInt();

        if (fromNumber >=0 && toNumber>=0) {
            if (fromNumber<toNumber){
                for (int i = fromNumber; i <toNumber ; i++) {
                    System.out.print(i +" ");
                }
            } else if (fromNumber>toNumber){
                temp=fromNumber;
                fromNumber=toNumber;
                toNumber=temp;
                for (int i = fromNumber; i <toNumber ; i++) {
                    System.out.print(i +" ");
                }
            }else {
                System.out.println("no option");
            }



        }
        else {
            System.out.println("Invalid Input");
        }


    }

}
