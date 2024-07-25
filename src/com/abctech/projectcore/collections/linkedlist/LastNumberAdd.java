package com.abctech.projectcore.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LastNumberAdd {
    /**
     * Write a Java program to append the specified element to the end of a linked list.
     */
    public static void main(String[] args) {
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(55);
        linkedlist.add(52);
        linkedlist.add(56);
        linkedlist.add(57);
        linkedlist.add(51);

        System.out.println(linkedlist);
        linkedlist.addLast(20);
        System.out.println(linkedlist);
    }
}
