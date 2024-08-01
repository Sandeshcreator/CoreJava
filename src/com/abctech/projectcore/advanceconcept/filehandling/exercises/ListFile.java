package com.abctech.projectcore.advanceconcept.filehandling.exercises;

import java.io.File;
import java.util.Arrays;

public class ListFile {
    public static void main(String[] args) {

        String fileBasePath = System.getProperty("user.home") + File.separator + "august" + File.separator + "friday";

        File directoryFile = new File(fileBasePath);

        String[] fileList = directoryFile.list();

        if (fileList != null) {
            for (String fileName : fileList) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("no file found");

        }


    }


}
