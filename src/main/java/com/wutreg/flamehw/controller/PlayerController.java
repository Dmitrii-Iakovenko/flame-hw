package com.wutreg.flamehw.controller;

import com.wutreg.flamehw.entity.Player;
import com.wutreg.flamehw.exception.PlayerNotFoundException;
import com.wutreg.flamehw.repository.PlayerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    private final PlayerRepository repository;

    public PlayerController(PlayerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/players")
    List<Player> all() {
        return repository.findAll();
    }

    @PostMapping("/players")
    Player newPlayer(@RequestBody Player newPlayer) {
        return repository.save(newPlayer);
    }

    @GetMapping("/players/{id}")
    Player one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow( () -> new PlayerNotFoundException(id));
    }

    @PutMapping("/players/{id}")
    Player replacePlayer(@RequestBody Player newPlayer, @PathVariable Long id) {
        return repository.findById(id)
                .map(player -> {
                    player.setNickname(newPlayer.getNickname());
                    player.setGuild(newPlayer.getGuild());
                    player.setHeroes1(newPlayer.getHeroes1());
                    player.setHeroes2(newPlayer.getHeroes2());
                    player.setHeroes3(newPlayer.getHeroes3());
                    player.setTitans(newPlayer.getTitans());
                    player.setDateTime(newPlayer.getDateTime());
                    player.setActual(newPlayer.getActual());
                    return repository.save(player);
                })
                .orElseGet(() -> {
                    newPlayer.setId(id);
                    return repository.save(newPlayer);
                });
    }

    @DeleteMapping("/players/{id}")
    void deletePlayer(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
