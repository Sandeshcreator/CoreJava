package com.abctech.projectcore;

import java.util.Scanner;

public class FindNumberExactlyDivisibleByThree {
    /**
     * Use Scanner to take input from user
     * Here you take lower limit and upper limit
     * loop should start from lower limit
     * loop should end in upper limit
     *
     * @param args
     */
    public static void main(String[] args) {
        FindNumberExactlyDivisibleByThree findNumberExactlyDivisibleByThree = new FindNumberExactlyDivisibleByThree();
        Scanner scanner = new Scanner(System.in);
        System.out.println("lower limit");
        int lowerLimit=scanner.nextInt();
        System.out.println("upper limit");
        int upperLimit =scanner.nextInt();
        for (int i = lowerLimit; i <=upperLimit ; i++) {
            if (findNumberExactlyDivisibleByThree.checkIfNumberIsExactlyDivisibleByThree(i)) {
                System.out.println(i);
            }
        }

    }

    /**
     * This function return true
     * If number is exactly divisible by 3
     * else false
     *
     * @param number
     * @return
     */
    public boolean checkIfNumberIsExactlyDivisibleByThree(int number) {
        if (number %3==0) {
            return true;
        }
        return false;
 }

}
