package com.abctech.projectcore.advanceconcept.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("a");
        stringList.add("b");
        stringList.add("boijfeifjf");
        stringList.add("boyssss");
        stringList.add("b");
        stringList.add("ac");
        stringList.add("ad");
        stringList.add("ap");

        for (String s : stringList) {
            System.out.println(s);
        }

        System.out.println("-------");

        List<String> stringArrayList = new ArrayList<>();
        //List(collection) to stream(string) appiled some filter and again to List(collection)

        stringArrayList = stringList.stream().filter(s -> s.startsWith("b") && s.length() > 2).collect(Collectors.toList());

        stringArrayList.stream().forEach(System.out::println);


        Stream<String> stringStream = stringList.stream();
        stringStream.filter(s -> s.startsWith("a")).forEach(s -> System.out.println(s));

        //we need to again create obj to do next operation one operation is allowed
        //stringStream.forEach(System.out::println);
    }
}
