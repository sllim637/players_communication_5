package org.example.models;

public class Player {

    private static final int MAX_SENT_MESSAGE = 10;
    private final String name;
    private Integer sentMessageCount;

    public Player(String name) {
        this.name = name;
        sentMessageCount = 0;
    }

    public void sendMessage(Player receiver, String content) {
        System.out.println(name + " send " + content);
        receiver.receiveMessage(this, content);
    }

    public void receiveMessage(Player sender, String message) {
        System.out.println(name + " receive " + message);
        sentMessageCount++;
        if (sentMessageCount <= MAX_SENT_MESSAGE) {
            this.sendMessage(sender, message + sentMessageCount);
        }
    }
}
