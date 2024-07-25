package com.abctech.projectcore.collections.arrylist;

import java.util.ArrayList;

public class PortionProgram {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(90);
        arrayList.add(0);
        arrayList.add(50);
        arrayList.add(850);

        int fromIndex = 1; // inclusive
        int toIndex = 4;   // exclusive

        ArrayList<Integer> arrayPortion = new ArrayList<>(arrayList.subList(fromIndex, toIndex));

        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Extracted Portion: " + arrayPortion);


    }
}
