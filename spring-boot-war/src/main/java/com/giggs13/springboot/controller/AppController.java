package com.giggs13.springboot.controller;

import com.giggs13.springboot.domain.Player;
import com.giggs13.springboot.domain.Team;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Controller
public class AppController {

    private Team team;

    @PostConstruct
    private void init() {
        Set<Player> players = new HashSet<>();
        players.add(new Player("Charlie Brown", "pitcher"));
        players.add(new Player("Snoopy", "shortstop"));
        team = new Team("California", "Peanuts", players);
    }

    @GetMapping("/")
    @ResponseBody
    public String getGreetingMessage() {
        return "Hello from Spring Boot War Application";
    }

    @GetMapping("/greeting/{name}")
    public String getGreetingView(Model model,
                                  @PathVariable String name) {
        model.addAttribute("name", name);

        return "greeting";
    }

    @GetMapping("/team")
    @ResponseBody
    public Team getTeam() {
        return team;
    }
}
