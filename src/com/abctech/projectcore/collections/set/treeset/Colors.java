package com.abctech.projectcore.collections.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Colors {
    public static void main(String[] args) {
        TreeSet<String> colour= new TreeSet<>();
        colour.add("Red");
        colour.add("Yellow");
        colour.add("black");

        Iterator<String> iterator= colour.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
