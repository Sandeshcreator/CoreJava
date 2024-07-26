package com.abctech.projectcore.collections.set.treeset;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class RevSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(46);
        treeSet.add(41);
        treeSet.add(45);

        System.out.println(treeSet.descendingSet());

    }
}
