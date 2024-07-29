package com.abctech.projectcore.collections.comparator;

import java.util.Comparator;

public class RollNumberComprator implements Comparator<School> {


    @Override
    public int compare(School o1, School o2) {
        return Integer.compare(o1.getRollNumber(),o2.getRollNumber());
    }
}
