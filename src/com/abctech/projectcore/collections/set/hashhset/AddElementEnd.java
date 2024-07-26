package com.abctech.projectcore.collections.set.hashhset;

import java.util.HashSet;
import java.util.Set;

public class AddElementEnd {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(50);
        set.add(52);
        set.add(55);
        set.add(50);

        System.out.println(set);

        set.add(599);

        System.out.println(set);

    }
}
