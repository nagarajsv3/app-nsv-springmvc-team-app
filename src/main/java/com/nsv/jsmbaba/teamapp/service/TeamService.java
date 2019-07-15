package com.nsv.jsmbaba.teamapp.service;

import com.nsv.jsmbaba.teamapp.domain.Team;

import java.util.List;

public interface TeamService {
    void createTeam(Team team);
    void updateTeam(Team team);
    Team getTeam(long id);
    List<Team> getAllTeams();
    void deleteTeam(Team team);
}
