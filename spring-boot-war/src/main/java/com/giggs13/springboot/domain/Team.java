package com.giggs13.springboot.domain;

import lombok.Data;

import java.util.Set;

@Data
public class Team {

    private String name;
    private String location;
    private String mascot;
    Set<Player> players;

    public Team(String name,
                String location,
                Set<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }
}
