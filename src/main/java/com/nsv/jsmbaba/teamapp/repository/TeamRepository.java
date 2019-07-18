package com.nsv.jsmbaba.teamapp.repository;

import com.nsv.jsmbaba.teamapp.domain.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TeamRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional(rollbackFor = RuntimeException.class, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void createOrUpdateTeam(Team team){
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(team);
        session.flush();
        session.close();
    }
    @Transactional(rollbackFor = RuntimeException.class, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public Team getTeam(long id){
        Session session = sessionFactory.openSession();
        Team team = (Team)session.get(Team.class, id);
        session.close();
        return team;
    }

    public List<Team> getAllTeams(){
        Session session = sessionFactory.openSession();
        List<Team> teams = session.createCriteria(Team.class).list();
        session.close();
        return teams;
    }

    @Transactional(rollbackFor = RuntimeException.class, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void deleteTeam(Team team){
        Session session = sessionFactory.openSession();
        session.delete(team);
        session.flush();
        session.close();
    }

    @Transactional(rollbackFor = RuntimeException.class, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRES_NEW)
    public void updateAnddeleteTeam(Team team){
        createOrUpdateTeam(team);
        deleteTeam(team);
    }
}
