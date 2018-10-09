package com.alek;

public class Main {

    public static void main(String[] args) {

        LeagueTable<FootballTeam> footballList = new LeagueTable<>("Football list");
        LeagueTable<BasketballTeam> basketballList = new LeagueTable<>("Basketball list");
        LeagueTable<VolleyballTeam> volleyballList = new LeagueTable<>("Volleyball list");


        FootballTeam manchesterUnited = new FootballTeam("Manchester United",1);
        FootballTeam realMadryt = new FootballTeam("Real Madryt", 2);
        FootballTeam fcBarcelona = new FootballTeam("FC Barcelona", 3);

        BasketballTeam losAngelesLakers = new BasketballTeam("Los Angeles Lakers", 3);
        BasketballTeam goldenStateWarriors = new BasketballTeam("Golden State Warriors", 2);
        BasketballTeam bostonCeltics = new BasketballTeam("Boston Celtics", 1);

        VolleyballTeam pgeSkra = new VolleyballTeam("PGE Skra Bełchatów", 2);
        VolleyballTeam asseco = new VolleyballTeam("Asseco Resovia", 1);
        VolleyballTeam zaksaKedzierzyn = new VolleyballTeam("ZAKSA Kędzierzyn-Koźle", 3);

        footballList.addTeam(manchesterUnited);
        footballList.addTeam(realMadryt);
        footballList.addTeam(fcBarcelona);
        footballList.addTeam(fcBarcelona);
      // footballList.addTeam(losAngelesLakers); i cant add team from another league

        basketballList.addTeam(losAngelesLakers);
        basketballList.addTeam(goldenStateWarriors);
        basketballList.addTeam(bostonCeltics);

        volleyballList.addTeam(pgeSkra);
        volleyballList.addTeam(asseco);
        volleyballList.addTeam(zaksaKedzierzyn);

        footballList.printTeams();
        basketballList.printTeams();
        volleyballList.printTeams();



    }

}
