package com.abctech.projectcore.collections.set.treeset;

import java.util.TreeSet;

public class RmoveLastFirst {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(90);
        treeSet.add(40);

        Integer lastElement = treeSet.pollLast();
        Integer firstElement = treeSet.pollFirst();

        System.out.println("Last element: " + lastElement);
        System.out.println("Last element: " + firstElement);
        System.out.println("Modified TreeSet: " + treeSet);


    }
}
