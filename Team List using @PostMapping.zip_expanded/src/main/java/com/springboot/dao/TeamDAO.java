package com.springboot.dao;

import java.util.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.springboot.domain.Team;

@Component
public class TeamDAO {

	static ArrayList<Team> teamList = new ArrayList<Team>();

	  static {
		teamList.add(new Team(1L,"Los Angeles Lakers","Frank Vogel",11,"Yellow"));
		teamList.add(new Team(2L,"Golden State Warriors","Steve Kerr",13,"Blue"));
		teamList.add(new Team(3L,"Chicago Bulls","Billy Donovan",12,"Red"));
		teamList.add(new Team(4L,"Brooklyn Nets","Steve Nash",13,"Black"));
	  }
	
	

	public Boolean save(Team team) {
		//Fill your code here
		teamList.add(team);
		return true;
	}


	public List<Team> list() {
		return teamList;
	}
	
}
