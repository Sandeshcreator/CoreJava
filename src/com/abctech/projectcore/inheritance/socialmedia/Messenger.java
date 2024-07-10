package com.abctech.projectcore.inheritance.socialmedia;

public class Messenger extends CommunicationChannel {
    private int count = 0;

    public Messenger(String account, String activeStatus) {
        super(account, activeStatus);
    }


    public void addStory() {
        count++;
        System.out.println("i am adding Story you have seen : " + count);

    }

    public void deleteStory() {
        System.out.println("i am deleting Story");

    }
}
