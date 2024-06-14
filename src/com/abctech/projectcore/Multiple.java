package com.abctech.projectcore;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput=scanner.nextInt();
        int limit =10;
        Multiple ml = new Multiple();
        ml.printMultiplicationTable(numberInput,limit);
    }

    /**
     * This function should have a loop
     * and loop terminates at limit
     * @param number
     * @param limit
     */
    public void printMultiplicationTable(int number, int limit) {
        for (int i = 1; i <=limit ; i++) {
            System.out.println(giveMeTableLine(number,i));
        }

    }

    /**
     * This function is called to print multiplication table line
     * 2 X 1 = 2 should return this
     * 2 X 2 = 4 should return this
     * @param number
     * @return
     */
    public String giveMeTableLine(int number ,int i) {

        return number + " X "+ i  +" = "+(number*i);
    }

}

