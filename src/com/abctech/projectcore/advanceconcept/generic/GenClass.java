package com.abctech.projectcore.advanceconcept.generic;

public class GenClass<T> {
    private T items;

    public GenClass(T items) {
        this.items = items;
    }

    public void display() {
        System.out.println("you  provided " + items);
    }
}
