package com.chatapp.chatapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/test", method=RequestMethod.GET)
    public String test(Model model){
        System.out.println("hit test method");
        model.addAttribute("name", "this coming from controller param");
        return "test";
    }
}
