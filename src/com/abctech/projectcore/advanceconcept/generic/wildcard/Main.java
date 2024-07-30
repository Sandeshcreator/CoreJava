package com.abctech.projectcore.advanceconcept.generic.wildcard;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integers=new HashSet<>();
        integers.add(500);
        integers.add(20);
        integers.add(2);

        display(integers);

    }

    public static void display(Set<?> set){
        Iterator<?> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
