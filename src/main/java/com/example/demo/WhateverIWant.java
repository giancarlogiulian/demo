package com.example.demo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;

@RestController
public class WhateverIWant {
	
	private Team team;
	
	@PostConstruct
	public void init() {
		
		Set<Player> players = new HashSet<>();
		players.add(new Player("Lebron James", "ala"));
		players.add(new Player("Michael Jackson", "ala"));
		
		team = new Team("Lakers", "Los Angeles", players);
		
	}
	
	@RequestMapping("/hi")
	public @ResponseBody Team hiThere( Map model ) {
		return team;
	}

}
