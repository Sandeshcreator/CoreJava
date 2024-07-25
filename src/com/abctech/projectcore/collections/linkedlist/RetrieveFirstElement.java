package com.abctech.projectcore.collections.linkedlist;

import java.util.LinkedList;

public class RetrieveFirstElement {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        Integer firstElement = linkedList.peekFirst();

        Integer lastElement = linkedList.peekLast();

        System.out.println("First element: " + firstElement);
        System.out.println("First element: " + lastElement);
    }
}
