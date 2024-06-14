package com.abctech.projectcore.Loop;

public class NumberLoop {
    public static void main(String[] args) {
        /*
1
12
123
1234
12345
         */
        for (int i = 2; i < 8; i++) {
            //column
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");

        }

        for (int i = 6; i > 0; i--) {
            //column
            for (int j = 1; j <i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");

        }

    }
}
