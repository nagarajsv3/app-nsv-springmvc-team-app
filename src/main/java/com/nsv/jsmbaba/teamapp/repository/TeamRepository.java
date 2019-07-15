package com.nsv.jsmbaba.teamapp.repository;

import com.nsv.jsmbaba.teamapp.domain.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeamRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void createOrUpdateTeam(Team team){
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(team);
        session.flush();
        session.close();
    }

    public Team getTeam(long id){
        Session session = sessionFactory.openSession();
        Team team = (Team)session.load(Team.class, id);
        session.close();
        return team;
    }

    public List<Team> getAllTeams(){
        Session session = sessionFactory.openSession();
        List<Team> teams = session.createCriteria(Team.class).list();
        session.close();
        return teams;
    }

    public void deleteTeam(Team team){
        Session session = sessionFactory.openSession();
        session.delete(team);
        session.flush();
        session.close();
    }
}
