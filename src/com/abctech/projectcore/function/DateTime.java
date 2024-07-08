package com.abctech.projectcore.function;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {

    public static void displayCurrentDateTime() {
        // Current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
    }

    public static void main(String[] args) {
        displayCurrentDateTime();
    }

}
