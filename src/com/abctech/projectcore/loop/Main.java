package com.abctech.projectcore.loop;

import java.util.Scanner;

public class Main {
    //Loop
    public static void main(String[] args) {
//        5 X 4 X 3 X 2 X 1 = 120
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number wanted");
        int userIn = sc.nextInt();
        int multi = 1;

        for (int i = userIn; i >= 1; i--) {
            multi *= i;

        }
        System.out.println(multi);



    }
}
