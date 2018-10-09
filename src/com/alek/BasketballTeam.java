package com.alek;

public class BasketballTeam extends Team {

    public BasketballTeam(String name, int points) {
        super(name, points);
    }

    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}
