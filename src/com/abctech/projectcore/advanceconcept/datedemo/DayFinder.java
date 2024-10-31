package com.abctech.projectcore.advanceconcept.datedemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayFinder {
    public static void main(String[] args) throws ParseException {
        Scanner scanner= new Scanner(System.in);

        System.out.println("yyyy-mm-dd");

        String dob= scanner.nextLine();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date dateOfBirth = dateFormat.parse(dob);

        DateFormat dateFormat1= new SimpleDateFormat("EEEE");

        String format = dateFormat1.format(dateOfBirth);

        System.out.println(format);


    }
}
