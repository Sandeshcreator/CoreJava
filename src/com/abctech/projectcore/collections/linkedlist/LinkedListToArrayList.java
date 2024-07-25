package com.abctech.projectcore.collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);

        System.out.println(arrayList);

    }
}
