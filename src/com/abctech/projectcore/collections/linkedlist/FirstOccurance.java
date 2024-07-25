package com.abctech.projectcore.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class FirstOccurance {
    public static void main(String[] args) {
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(55);
        linkedlist.add(52);
        linkedlist.add(56);
        linkedlist.add(57);
        linkedlist.add(57);
        linkedlist.add(57);
        linkedlist.add(57);
        linkedlist.add(56);

        System.out.println(linkedlist.indexOf(56));
        System.out.println(linkedlist.lastIndexOf(56));
    }
}
