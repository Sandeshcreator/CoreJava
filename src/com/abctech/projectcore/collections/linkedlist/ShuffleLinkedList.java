package com.abctech.projectcore.collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShuffleLinkedList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println("LinkedList before shuffling: " + linkedList);

        Collections.shuffle(linkedList);

        System.out.println("LinkedList after shuffling: " + linkedList);
    }
}
