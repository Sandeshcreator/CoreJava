package com.abctech.projectcore.advanceconcept.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Program1 {

    public static void main(String[] args) throws FileNotFoundException {
        List<String> stringList = getName();

        System.out.println(stringList);
        System.out.println(stringList.size());

        List<String> distinctUsingInbuilt = stringList.stream().distinct().collect(Collectors.toList());
        Set<String> distinctUsingCollector = stringList.stream().collect(Collectors.toSet());

        Optional<String> optionalS = distinctUsingInbuilt.stream().findFirst();
        if (optionalS.isPresent()) {
            System.out.println(optionalS.get());
        }


        // System.out.println(distinctUsingInbuilt.size());

    }


    public static List<String> getName() throws FileNotFoundException {
        ArrayList<String> arrayList = new ArrayList<>();
        String fileBasePath = System.getProperty("user.home") + File.separator + "august" + File.separator + "friday";

        File file = new File(fileBasePath);

        File myFile = new File(fileBasePath + File.separator + "app.txt");

        Scanner scanner = new Scanner(myFile);
        String line = "";
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            arrayList.add(line);

        }
        return arrayList;

    }
}
