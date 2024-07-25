package com.abctech.projectcore.collections.linkedlist;

import java.util.LinkedList;

public class CloneLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(40);

        LinkedList<Integer> clonelist = (LinkedList<Integer>) originalList.clone();


    }
}
