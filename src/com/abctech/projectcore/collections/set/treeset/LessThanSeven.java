package com.abctech.projectcore.collections.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class LessThanSeven {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(45);


        TreeSet<Integer> numb7 = (TreeSet<Integer>) treeSet.headSet(7);


        System.out.println("Elements less than 7:");
        Iterator<Integer> iterator = numb7.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        Iterator<Integer> iterator= treeSet.iterator();
//
//        while (iterator.hasNext()){
//            int numb= iterator.next();
//            if (numb<7){
//                System.out.println(numb);
//            }
//        }
//



    }
}
