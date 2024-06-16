package com.abctech.projectcore.Function;

public class MainProgram {
    /**
     * Create a class called MainProgram and inside the class create a function called
     * display() with no parameters and inside a body of display method add a line “Hello,
     * I am called”. Call the function from the main method of MainProgram by creating
     * the object of MainProgram.
     */
    public static void main(String[] args) {
        MainProgram mainProgram= new MainProgram();
        mainProgram.display();

    }
    public void display(){
        System.out.println("Hello, I am called");
    }

}
