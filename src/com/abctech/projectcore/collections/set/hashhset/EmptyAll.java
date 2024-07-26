package com.abctech.projectcore.collections.set.hashhset;

import java.util.Collections;
import java.util.HashSet;

public class EmptyAll {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(52);
        hashSet.add(2);
        hashSet.add(50);
        hashSet.add(9);

        System.out.println(hashSet);

        hashSet.removeAll(hashSet);
        //hashSet.clear();

        System.out.println(hashSet);
    }
}
