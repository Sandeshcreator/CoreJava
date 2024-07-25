package com.abctech.projectcore.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class InsertItems {
    public static void main(String[] args) {
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(55000);
        linkedlist.add(52);
        linkedlist.add(56);
        linkedlist.add(57);
        linkedlist.add(57555);
        linkedlist.add(57);
        linkedlist.add(57);
        linkedlist.add(56);

        linkedlist.add(1, 88888);
        System.out.println(linkedlist);


//Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList<Integer> newlist = new LinkedList<>();
        newlist.add(1);
        newlist.add(2);
        newlist.add(6);
        newlist.add(8);

        linkedlist.addAll(4, newlist);

        System.out.println(linkedlist);


    }
}
