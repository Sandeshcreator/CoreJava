package com.abctech.projectcore.inheritance.socialmedia;

public class Program {
    /**
     * Create a class called CommunicationChannel and in that class add two data members
     * of type string one is account and another is activeStatus.
     * This class should contain two methods audio call and video call.
     * When we call audio and video call methods. It should show calling only
     * if the person is active. Now create two classes Instagram and Messenger
     * which will be inheriting the class CommunicationChannel.
     * In instagram add a function that add notes , delete notes
     * In messenger add a function that add story and remove story
     * Also add a count in messenger which will show the story view count with the trigger of view story method
     * Create a main program to execute all these
     */
    public static void main(String[] args) {
        Instagram instagram = new Instagram("online", "active");
        instagram.addNotes();
        instagram.deleteNotes();
        instagram.audioCall();
        instagram.videoCall();

        Messenger messenger = new Messenger("online", "active");
        messenger.addStory();
        messenger.addStory();
        messenger.audioCall();
        messenger.videoCall();


    }
}
