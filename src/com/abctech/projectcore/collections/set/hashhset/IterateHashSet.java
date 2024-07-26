package com.abctech.projectcore.collections.set.hashhset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("san");
        set.add("desh");
        set.add("sandy");

        System.out.println("Iterating using an Iterator:");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println("for each ");
        for (String ele : set) {
            System.out.println(ele);
        }

        System.out.println(" lamda");
        set.forEach(ele -> {
            System.out.println(ele);
        });
    }
}
