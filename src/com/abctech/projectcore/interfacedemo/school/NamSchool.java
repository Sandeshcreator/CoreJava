package com.abctech.projectcore.interfacedemo.school;

public class NamSchool implements RulesSchool {
    @Override
    public void mainRule() {
        System.out.println("no junk food");

    }

    @Override
    public void shortHair() {
        System.out.println("only 1 inch hair");

    }
}
