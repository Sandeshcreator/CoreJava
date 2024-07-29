package com.abctech.projectcore.collections.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        ArrayList<School> schoolArrayList = new ArrayList<>();
        schoolArrayList.add(new School(1, 98605454, "sandesh"));
        schoolArrayList.add(new School(4, 986054, "kalyan"));
        schoolArrayList.add(new School(7, 9805454, "sabina"));
        schoolArrayList.add(new School(2, 980454, "sadikshya"));

//        Collections.sort(schoolArrayList, new RollNumberComprator());
        Collections.sort(schoolArrayList, new NameComprator());

        Iterator<School> schoolIterator = schoolArrayList.iterator();
        while (schoolIterator.hasNext()) {
            System.out.println(schoolIterator.next());
        }

    }
}
