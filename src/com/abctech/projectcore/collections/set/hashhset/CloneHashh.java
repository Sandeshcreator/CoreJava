package com.abctech.projectcore.collections.set.hashhset;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class CloneHashh {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(52);
        hashSet.add(2);
        hashSet.add(50);
        hashSet.add(9);

        HashSet<Integer> hashSet1 = new HashSet<Integer>();
       hashSet1 = (HashSet) hashSet.clone();

        System.out.println(hashSet1);

    }
}
