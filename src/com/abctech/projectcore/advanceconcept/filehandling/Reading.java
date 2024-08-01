package com.abctech.projectcore.advanceconcept.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("sandesh.txt"));

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);

                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
