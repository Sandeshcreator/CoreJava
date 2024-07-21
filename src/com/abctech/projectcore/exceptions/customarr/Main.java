package com.abctech.projectcore.exceptions.customarr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyCustomException {
        int [] numb = new int[5];
        numb[0]=2;
        numb[1]=5;
        numb[2]=6;
        numb[3]=8;
        numb[4]=9;
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        try {
            System.out.println(numb[userInput]);

        }catch (Exception ex){
            throw new MyCustomException("Value cannot be negative!");
        }
    }
}
