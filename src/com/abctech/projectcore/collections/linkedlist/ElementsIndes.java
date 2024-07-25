package com.abctech.projectcore.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ElementsIndes {
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

        for (int i = 0; i < linkedlist.size(); i++) {
            System.out.println(linkedlist.get(i) + " index :" + i);
        }
    }
}
