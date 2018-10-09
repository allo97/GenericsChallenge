package com.alek;

public class FootballTeam extends Team{

    public FootballTeam(String name, int points) {
        super(name, points);
    }

    @Override
    public void play() {
        System.out.println("Playing football");
    }
}
