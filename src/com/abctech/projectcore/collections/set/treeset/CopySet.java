package com.abctech.projectcore.collections.set.treeset;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class CopySet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(46);
        treeSet.add(41);
        treeSet.add(45);

        treeSet1.addAll(treeSet);

        for (int trr : treeSet1) {
            System.out.println(trr);
        }
    }
}
