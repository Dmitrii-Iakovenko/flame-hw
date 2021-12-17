package com.wutreg.flamehw.controller;

import com.wutreg.flamehw.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("players")
public class PlayerController {

    private final PlayerRepository repository;

    @Autowired
    public PlayerController(PlayerRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("something", "All players in Data Base");
        model.addAttribute("players", repository.findAll());
        return "players/show-all";
    }

    @GetMapping("add")
    public String showAddForm(Model model) {
        model.addAttribute("something", "Add player in Data Base");
        return "players/add-new";
    }
}
