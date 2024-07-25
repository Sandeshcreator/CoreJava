package com.abctech.projectcore.collections.arrylist;

import java.util.*;

public class ArrayToList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("sandesh");
        arrayList.add("sandy");

        String[] names = arrayList.toArray(new String[0]);

        for (String name : names) {
            System.out.println(name);
        }

        String[] places = {"Ason", "jamal"};

        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1, places);
        System.out.println(arrayList1);


    }
}
