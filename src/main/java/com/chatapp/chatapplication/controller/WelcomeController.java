package com.chatapp.chatapplication.controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String welcome(Model model){
        System.out.println("hit test method");
        return "welcome";
    }

    @RequestMapping(value = "/login", method=RequestMethod.POST)
    public String login(@Validated User user, Model model){
        System.out.println("hit login method, username is: "+user.userName);

        model.addAttribute("userName", user.userName);
        return "greeting";
    }
}
