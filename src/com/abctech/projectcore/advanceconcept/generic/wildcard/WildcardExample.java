package com.abctech.projectcore.advanceconcept.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        printNumbers(intList);


        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        printNumbers(doubleList);
    }
}
