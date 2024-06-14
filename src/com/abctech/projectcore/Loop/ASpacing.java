package com.abctech.projectcore.Loop;

public class ASpacing {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int k = i; k <= 4; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("a");
            }
            System.out.println("");
        }
        for (int i = 5; i > 0; i--) {
            for (int k = i; k <= 4; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("a");
            }
            System.out.println(" ");

        }


    }
}
