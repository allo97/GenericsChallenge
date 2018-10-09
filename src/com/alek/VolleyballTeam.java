package com.alek;

public class VolleyballTeam extends Team {

    public VolleyballTeam(String name, int points) {
        super(name, points);
    }

    @Override
    public void play() {
        System.out.println("Playing volleyball");
    }
}
