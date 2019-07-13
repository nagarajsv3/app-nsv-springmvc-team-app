package com.nsv.jsmbaba.teamapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/hello")
public class HelloController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String loadHelloPage(){
        return "hello";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String loadTestGetPage(){
        return "hello";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String loadTestPostPage(){
        return "hello";
    }
}
