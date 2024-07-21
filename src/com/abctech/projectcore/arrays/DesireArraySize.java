package com.abctech.projectcore.arrays;

public class DesireArraySize {
    public static void main(String[] args) {
        int[] nm = new int[2];
        for (int i = 0; i < nm.length; i++) {
            nm[i] = i;
        }
        for (int hh : nm) {
            System.out.println(hh);
        }
    }
}
