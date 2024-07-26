package com.abctech.projectcore.collections.set.hashhset;

import java.util.HashSet;
import java.util.TreeSet;

public class ToTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(52);
        hashSet.add(2);
        hashSet.add(50);
        hashSet.add(9);

        TreeSet<Integer> treeSet= new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
