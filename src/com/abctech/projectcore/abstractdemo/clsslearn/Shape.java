package com.abctech.projectcore.abstractdemo.clsslearn;

public abstract class Shape {
    private String color;


    abstract double calculateArea();

    abstract double calculatePerimeter();

    public void display(String type, String  shapename,String data){
        switch (type){
            case"area":
                System.out.println("The "+type + " of" + shapename + " with color "+ color +" " + data + " m2");

                break;
            case"perimeter":
                System.out.println("The "+type + " of" + shapename + " is " + data + " meter");

                break;
            default:
                System.out.println("Do nothing");

        }
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
