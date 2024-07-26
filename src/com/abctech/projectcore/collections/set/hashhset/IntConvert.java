package com.abctech.projectcore.collections.set.hashhset;

import java.util.HashSet;

public class IntConvert {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(52);
        hashSet.add(2);
        hashSet.add(50);
        hashSet.add(9);

        int[] arr = new int[hashSet.size()];

        int index = 0;
        for (Integer num : hashSet) {
            arr[index] = num;
            index++;
        }

    }
}
