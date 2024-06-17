package com.abctech.projectcore.Function;

import java.util.Scanner;

public class AverageNumber {
    /**
     * 7. Create a function called averageNumber(int num1 , int num2 , int num3)
     * and inside the function display the highest and lowest among three numbers.
     */
    int highest;
    int lowest;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AverageNumber averageNumber = new AverageNumber();
        System.out.println("Enter a first number ");
        int num1  = scanner.nextInt();
        System.out.println("Enter a second  number ");
        int num2  = scanner.nextInt();
        System.out.println("Enter a third number ");
        int num3 = scanner.nextInt();
        int[] results = averageNumber.averageNumber(num1, num2,num3);
        System.out.println("The highest number is: " + results[0]);
        System.out.println("The lowest number is: " + results[1]);
        
    }
    
    public int[] averageNumber(int num1 , int num2 , int num3){

        if (num1 >= num2 && num1 >= num3) {
            highest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            highest = num2;
        } else {
            highest = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            lowest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            lowest = num2;
        } else {
            lowest = num3;
        }

        return new int[] { highest, lowest };

    }
}
