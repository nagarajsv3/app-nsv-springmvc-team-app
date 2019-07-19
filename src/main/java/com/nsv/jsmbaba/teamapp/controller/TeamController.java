package com.nsv.jsmbaba.teamapp.controller;

import com.nsv.jsmbaba.teamapp.domain.Team;
import com.nsv.jsmbaba.teamapp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value="/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView loadAddTeamPage(){
        ModelAndView modelAndView = new ModelAndView("add");
        modelAndView.addObject("team",new Team());
        return modelAndView;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createTeam(@ModelAttribute Team team){
        ModelAndView modelAndView = new ModelAndView("home");
        teamService.createTeam(team);
        String message = "Team is successfully created";
        modelAndView.addObject("message",message);
        return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editTeam(@PathVariable("id") long id){
        ModelAndView modelAndView = new ModelAndView("edit");
        Team team = teamService.getTeam(id);
        modelAndView.addObject("team",team);
        return modelAndView;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView updateTeam(@ModelAttribute Team team){
        ModelAndView modelAndView = new ModelAndView("home");
        teamService.updateTeam(team);
        String message = "Team is successfully updated";
        modelAndView.addObject("message",message);
        return modelAndView;
    }



    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @Secured("ROLE_ADMIN")
    public ModelAndView deleteTeam(@RequestParam("teamId") long id){
        ModelAndView modelAndView = new ModelAndView("home");
        teamService.deleteTeam(teamService.getTeam(id));
        String message = "Team is successfully deleted";
        modelAndView.addObject("message",message);
        return modelAndView;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView listTeams(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Team> teams = teamService.getAllTeams();
        modelAndView.addObject("teams",teams);
        return modelAndView;
    }
}
