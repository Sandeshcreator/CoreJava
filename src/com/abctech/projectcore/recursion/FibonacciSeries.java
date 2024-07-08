package com.abctech.projectcore.recursion;

public class FibonacciSeries {
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i <= n; i++) {
            System.out.print(fibb(i) + " ");
        }    }

    static int fibb(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibb(n - 1) + fibb(n - 2);
        }
    }
}
