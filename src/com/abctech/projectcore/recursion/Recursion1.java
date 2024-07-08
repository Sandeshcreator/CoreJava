package com.abctech.projectcore.recursion;

class Recursion1 {
    public static int printFactorial(int n) {
        if(n == 0 || n==1) {
            return 1;
        }


        return n * printFactorial(n - 1);
    }
    public static void main(String args[]) {
        System.out.println( printFactorial(5));
    }
}