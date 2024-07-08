package com.abctech.projectcore.loop;

public class AllStar {
    public static void main(String[] args) {
        //row will prnt 5 times
//        for (int i = 5; i >= 0; i--) {
//            //column
//            for (int j = i; j > 0; j--) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//
//        }


        for (int i = 1; i < 5; i++) {
            //column
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }


    }
}
