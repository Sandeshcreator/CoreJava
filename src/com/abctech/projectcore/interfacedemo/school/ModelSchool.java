package com.abctech.projectcore.interfacedemo.school;

public class ModelSchool implements RulesSchool {
    @Override
    public void mainRule() {
        System.out.println("no phone");

    }

    @Override
    public void shortHair() {
        System.out.println("no restriction shortHair");
    }

}
