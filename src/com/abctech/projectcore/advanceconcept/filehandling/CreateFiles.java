package com.abctech.projectcore.advanceconcept.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFiles {
    public static void main(String[] args) {
        File file = new File("sandesh.txt");
        try {
            file.createNewFile();
            System.out.println("Created sucess");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
