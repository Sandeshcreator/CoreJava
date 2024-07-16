package com.abctech.projectcore.abstractdemo.clsslearn;

import java.text.DecimalFormat;

public class MainProgram {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setRadius(10.25);
        circle.setColor("red");

        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();

        circle.display("area" ,"circle", new DecimalFormat("#.##").format(area));
        circle.display("perimeter" ,"circle", new DecimalFormat("#.##").format(perimeter));

    }
}
