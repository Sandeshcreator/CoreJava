package com.abctech.projectcore.loop;

import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number wanted");
        int userIn = sc.nextInt();
// count occurance

        System.out.println("Enter a number want to see repated or not");
        int repNumber = sc.nextInt();
        int count=0;
        for (int i = 0; i <userIn ; i++) {
            int remn=userIn%10;
            if(remn==repNumber){
                count++;

            }
            userIn=userIn/10;

        }
        System.out.println(count);
    }
}
