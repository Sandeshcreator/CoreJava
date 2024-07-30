package com.abctech.projectcore.advanceconcept.generic;

public class Main {
    public static void main(String[] args) {
//        GenClass<Integer> genClass = new GenClass<>(22);
//        genClass.display();
//
//        GenClass<String> stringGenClass = new GenClass<>("its your boy sandy");
//        stringGenClass.display();
//
//        GenClass<Double> doubleGenClass = new GenClass<>(55.5);
//        doubleGenClass.display();


        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"A", "B", "C", "D", "E"};

        diss(intArray);
        diss(doubleArray);
        diss(stringArray);
    }

    public static <T> void diss(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
