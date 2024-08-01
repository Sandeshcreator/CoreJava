package com.abctech.projectcore.advanceconcept.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteProgram {
    public static void main(String[] args) throws IOException {
//        String os= System.getProperty("os.version");
//        System.out.println(os);
        String fileBasePath = System.getProperty("user.home") + File.separator + "august" + File.separator + "friday";

        File directoryFile = new File(fileBasePath);
        if (!directoryFile.exists()) {
            directoryFile.mkdirs();
        } else {
            System.out.println("folder already exists");
        }

        File myFile = new File(fileBasePath + File.separator + "app.txt");
        FileWriter fileWriter = new FileWriter(myFile, true);
        fileWriter.write("This is Every thing\n");

        fileWriter.close();

        System.out.println("writing in file done");


    }
}
