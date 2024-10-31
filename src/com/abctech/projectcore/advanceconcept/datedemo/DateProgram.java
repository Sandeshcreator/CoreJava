package com.abctech.projectcore.advanceconcept.datedemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProgram {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        DateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd  EEEE");
        String formatedDate = dateFormat.format(date);

        System.out.println(formatedDate);
    }
}
