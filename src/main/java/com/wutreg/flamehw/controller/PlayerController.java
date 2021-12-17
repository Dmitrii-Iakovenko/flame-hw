package com.wutreg.flamehw.controller;

import com.wutreg.flamehw.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {

    private final PlayerRepository repository;

    @Autowired
    public PlayerController(PlayerRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("something", "this is coming from the controller");
        model.addAttribute("players", repository.findAll());
        return "players";
    }
}
