package com.abctech.projectcore.advanceconcept.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("sandesh.txt");
            fileWriter.write("sandesh i am writing and i am sandesh haha \nbye see u soon");
            fileWriter.close();
            System.out.println("check its writen or not");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
