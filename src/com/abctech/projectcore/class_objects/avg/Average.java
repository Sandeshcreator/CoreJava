package com.abctech.projectcore.class_objects.avg;

public class Average {
    private int numbOne, numbTwo, numbThree;

    public Average(int numbOne, int numbTwo, int numbThree) {
        this.numbOne = numbOne;
        this.numbTwo = numbTwo;
        this.numbThree = numbThree;
    }
    public int getAverage() {
        return (numbOne + numbTwo + numbThree) / 3;
    }
}
