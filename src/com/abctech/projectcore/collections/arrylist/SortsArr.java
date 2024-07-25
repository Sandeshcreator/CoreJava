package com.abctech.projectcore.collections.arrylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortsArr {
    public static void main(String[] args) {
        //  Write a Java program to sort a given array list.
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(90);
        arrayList.add(0);
        arrayList.add(50);
        arrayList.add(850);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
