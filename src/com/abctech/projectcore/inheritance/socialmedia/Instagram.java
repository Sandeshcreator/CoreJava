package com.abctech.projectcore.inheritance.socialmedia;

public class Instagram extends CommunicationChannel {

    public Instagram(String account, String activeStatus) {
        super(account, activeStatus);
    }

    public void addNotes() {
        System.out.println("i am adding");

    }

    public void deleteNotes() {
        System.out.println("i am deleting");

    }
}
