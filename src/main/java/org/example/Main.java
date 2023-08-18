package org.example;


import org.example.models.Player;

public class Main {
    public static void main(String[] args) {
        Player initiator = new Player("payer 1");
        Player john = new Player("player 2");
        initiator.sendMessage(john, "Hello");

    }
}
