package com.abctech.projectcore.loop;

import java.util.Scanner;

public class SumDisplayedDoWhile {
    /**
     *  Write a do-while loop that asks the user to enter two numbers.
     *  The numbers should be added and the sum displayed.
     *  The loop should ask the user whether he or she wishes to perform the operation again.
     *  If so, the loop should repeat; otherwise it should terminate.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repate;
 do {
     int userInputOne = scanner.nextInt();
     int userInputTwo = scanner.nextInt();

     System.out.println(userInputOne+userInputTwo);
     System.out.println("Do you want again to repeat process(y/n");
     scanner.nextLine();
      repate = scanner.nextLine();

 }while (repate.equalsIgnoreCase("y"));
    }

}
