package com.alek;

public class Team<T> implements Comparable<Team<T>> {

    private String name;
    private Integer points;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void play() {

    }

    @Override
    public int compareTo(Team<T> team) {
        return this.points.compareTo(team.points);  //return by ranking and not by alphabetical order
        //return (this.name.compareTo(team.getName()));
    }
}
