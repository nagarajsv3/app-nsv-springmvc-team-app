package com.nsv.jsmbaba.teamapp.service;

import com.nsv.jsmbaba.teamapp.domain.Team;
import com.nsv.jsmbaba.teamapp.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public void createTeam(Team team) {
        teamRepository.createOrUpdateTeam(team);
    }

    @Override
    public void updateTeam(Team team) {
        teamRepository.createOrUpdateTeam(team);
    }

    @Override
    public Team getTeam(long id) {
        return teamRepository.getTeam(id);
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.getAllTeams();
    }

    @Override
    public void deleteTeam(Team team) {
        teamRepository.deleteTeam(team);
    }
}
