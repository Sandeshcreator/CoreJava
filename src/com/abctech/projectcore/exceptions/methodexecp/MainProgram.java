package com.abctech.projectcore.exceptions.methodexecp;

import com.abctech.projectcore.exceptions.customarr.MyCustomException;

import java.util.Scanner;

public class MainProgram {
    private static int[] numb = new int[5];

    public static void main(String[] args) {
        numb[0] = 2;
        numb[1] = 5;
        numb[2] = 6;
        numb[3] = 8;
        numb[4] = 9;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index (0-4):");
        int userInput = scanner.nextInt();

        try {
            validateIndex(userInput);
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateIndex(int index) throws MyCustomException {
        if (index < 0 || index >= numb.length) {
            throw new MyCustomException("Index out of bbbb.");
        }
        System.out.println("Value at index " + index + ": " + numb[index]);
    }
}
