package com.abctech.projectcore.abstractdemo.constructorabstract;

public abstract class ParentConst {

    public ParentConst() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    public void normalClas() {
        System.out.println("This is a normal method of abstract class");
    }
}
