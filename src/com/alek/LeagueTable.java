package com.alek;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team>{
    private List<T> teams;
    private String listName;

    public LeagueTable(String listName) {
        this.teams = new ArrayList<>();
        this.listName = listName;
        System.out.println("A new League Table has been made: " + this.listName);
    }

    public boolean addTeam(T team) {
        if(teams.contains(team)) {
            System.out.println(team.getName() + " already exists!!!");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " has been added to " + this.listName);
            return true;
        }
    }

    public void printTeams() {
        Collections.sort(this.teams, Collections.reverseOrder());
        System.out.println("Here is your League Teams Ranking!!");
        for(int i = 0; i < this.teams.size(); i++) {
            System.out.println((i + 1) + ". " + this.teams.get(i).getName() + " " + this.teams.get(i).getPoints());
        }

//        for(T t : teams) {
//            System.out.println(t.getName() + ": " + t.getPoints());
//        }
    }


}
