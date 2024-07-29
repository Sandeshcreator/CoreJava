package com.abctech.projectcore.collections.comparator;

import java.util.Comparator;

public class NameComprator implements Comparator<School> {

    @Override
    public int compare(School o1, School o2) {
        return o1.getName().compareTo(o2.getName()) ;
    }
}
