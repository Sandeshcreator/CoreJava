package com.abctech.projectcore.advanceconcept.filehandling.exercises;

import java.io.File;

public class IsDirectoryExists {
    public static void main(String[] args) {
        String fileBasePath = System.getProperty("user.home") + File.separator + "august" + File.separator + "friday";

        File directoryFile = new File(fileBasePath);

        if (directoryFile.exists()) {
            System.out.println("go ahead");
        } else {
            System.out.println("no file");
        }
    }
}
