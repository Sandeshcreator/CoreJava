package com.abctech.projectcore.advanceconcept.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileReadProgram {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path of the path you want to read");
        String filePathInput = scanner.nextLine();

        File file = new File(filePathInput);
        if (file.exists()) {
            FileReader fileReader = new FileReader(file);
            Scanner scanner1 = new Scanner(file);
            String line = "";
            try {
                while ((line = scanner1.nextLine()) != null) {

                    System.out.println(line);
                }
            } catch (NoSuchElementException exception) {
                System.out.println("reading completed");
            }

            scanner1.close();

        } else {
            System.out.println("File does not exist");
        }
    }
}
