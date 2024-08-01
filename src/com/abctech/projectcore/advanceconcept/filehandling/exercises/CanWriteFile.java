package com.abctech.projectcore.advanceconcept.filehandling.exercises;

import java.io.File;

public class CanWriteFile {
    public static void main(String[] args) {
        File file = new File("sandesh.txt");
        if (file.exists()) {
            if (file.canWrite()) {
                System.out.println("i can write");
            }
            if (file.canRead()) {
                System.out.println("i can read too");
            }
        } else {
            System.out.println("no such file found");
        }
    }
}
