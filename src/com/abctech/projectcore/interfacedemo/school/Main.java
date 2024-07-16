package com.abctech.projectcore.interfacedemo.school;

public class Main {
    public static void main(String[] args) {
        RulesSchool modelSchool = new ModelSchool();

        modelSchool.mainRule();
        modelSchool.shortHair();
        RulesSchool.allCommon();

        System.out.println("-----X------");

        RulesSchool namSchool = new NamSchool();

        namSchool.mainRule();
        namSchool.shortHair();
        RulesSchool.allCommon();
    }
}
