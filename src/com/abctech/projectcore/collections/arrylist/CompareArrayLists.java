package com.abctech.projectcore.collections.arrylist;

import java.util.ArrayList;
import java.util.Collections;

public class CompareArrayLists {
    public static void main(String[] args) {
        // Create two ArrayLists of Integers
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Add elements to list1
        list1.add(10);
        list1.add(20);
        list1.add(30);

        // Add elements to list2
        list2.add(10);
        list2.add(20);
        list2.add(30);

        // Check if both lists are equal
        boolean areEqual = list1.equals(list2);
        System.out.println("Are both lists equal? " + areEqual);

        // Compare sizes of both lists
        boolean areSizesEqual = list1.size() == list2.size();
        System.out.println("Are the sizes of both lists equal? " + areSizesEqual);

        // Check if list1 contains all elements of list2
        boolean containsAll = list1.containsAll(list2);
        System.out.println("Does list1 contain all elements of list2? " + containsAll);

        // Check if list2 contains all elements of list1
        boolean containsAllReverse = list2.containsAll(list1);
        System.out.println("Does list2 contain all elements of list1? " + containsAllReverse);


    }
}
