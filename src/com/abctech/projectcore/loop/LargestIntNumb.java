package com.abctech.projectcore.loop;

public class LargestIntNumb {
    /**
     * 19. Write a program to find the largest digit in a number. Example 12345 => output
     */

    public static void main(String[] args) {
        int number=123495;
        int largestNumber = 0;
        int result = 0;
        while (number > 0) {
            int digit = number % 10;
            if (largestNumber<digit){
                largestNumber=digit;
            }
            number /= 10;
        }
        System.out.println(largestNumber);
    }
}
