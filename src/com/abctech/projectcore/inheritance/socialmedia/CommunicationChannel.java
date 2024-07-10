package com.abctech.projectcore.inheritance.socialmedia;

public class CommunicationChannel {
    private String account;
    private String activeStatus;

    public CommunicationChannel(String account, String activeStatus) {
        this.account = account;
        this.activeStatus = activeStatus;
    }

    public void audioCall() {
        if (activeStatus.equalsIgnoreCase("active") && account.equalsIgnoreCase("online")) {
            System.out.println("calling ... audioCall");
        }
    }

    public void videoCall() {
        if (activeStatus.equalsIgnoreCase("active") && account.equalsIgnoreCase("online")) {
            System.out.println("calling ... videoCall");
        }
    }


}
