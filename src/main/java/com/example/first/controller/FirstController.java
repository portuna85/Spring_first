package com.example.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String niceToMeethYou(Model model) {
        model.addAttribute("username","BJS");
        return "greetings";
    }
}