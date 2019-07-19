package com.nsv.jsmbaba.teamapp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loadLoginPage(){
        return "login";
    }

    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public String loadAccessDeniedPage(){
        return "accessDenied";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String performLogoutOperation(HttpServletRequest request, HttpServletResponse response){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null){
            new SecurityContextLogoutHandler().logout(request,response,authentication);
        }
        return "redirect:/login";
    }
}
