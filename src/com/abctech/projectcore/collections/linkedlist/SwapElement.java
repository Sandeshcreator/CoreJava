package com.abctech.projectcore.collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SwapElement {
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

        Collections.swap(linkedlist, 0, 4);
        System.out.println(linkedlist);


    }
}
