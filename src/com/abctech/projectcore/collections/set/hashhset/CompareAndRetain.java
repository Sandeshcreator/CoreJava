package com.abctech.projectcore.collections.set.hashhset;

import java.util.HashSet;

public class CompareAndRetain {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(52);
        hashSet.add(2);
        hashSet.add(50);
        hashSet.add(9);

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(52);
        hashSet1.add(25);
        hashSet1.add(50);
        hashSet1.add(90);


        System.out.println(hashSet);
        System.out.println(hashSet1);

        //keeps only which are same both
        hashSet.retainAll(hashSet1);

        System.out.println(hashSet);
    }
}
