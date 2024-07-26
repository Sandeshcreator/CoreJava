package com.abctech.projectcore.collections.set.hashhset;

import java.util.HashSet;

public class CompareTwo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(52);
        hashSet.add(2);
        hashSet.add(50);
        hashSet.add(9);

        HashSet<Integer> hashSet1 = new HashSet<>();

        hashSet1.add(52);
        hashSet1.add(2);
        hashSet1.add(50);
        hashSet1.add(9);

        System.out.println(hashSet.containsAll(hashSet1));
        System.out.println(hashSet.equals(hashSet1));
    }
}
