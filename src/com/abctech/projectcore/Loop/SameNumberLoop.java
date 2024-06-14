package com.abctech.projectcore.Loop;

public class SameNumberLoop {
    public static void main(String[] args) {
            /*
1
22
333
4444
55555
     */
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
