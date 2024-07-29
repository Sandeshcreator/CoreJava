package com.abctech.projectcore.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<School> schoolArrayList = new ArrayList<>();
        schoolArrayList.add(new School(1, 98605454, "sandesh"));
        schoolArrayList.add(new School(4, 986054, "kalyan"));
        schoolArrayList.add(new School(7, 9805454, "sabina"));
        schoolArrayList.add(new School(2, 980454, "sadikshya"));

        Collections.sort(schoolArrayList);

        Iterator<School> schoolIterator= schoolArrayList.iterator();
        while (schoolIterator.hasNext()){
            System.out.println(schoolIterator.next());
        }


    }
}
