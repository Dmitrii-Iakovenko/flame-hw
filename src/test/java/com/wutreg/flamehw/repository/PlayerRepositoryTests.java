package com.wutreg.flamehw.repository;

import com.wutreg.flamehw.entity.Player;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class PlayerRepositoryTests {

    private final PlayerRepository repository;

    @Autowired
    public PlayerRepositoryTests(PlayerRepository repository) {
        this.repository = repository;
    }

    @Test
    public void testAddNew() {
        Player testPlayer = new Player();
        testPlayer.setNickname("TestNickname");
        testPlayer.setGuild("TestGuild");
        testPlayer.setHeroes1(400);
        testPlayer.setHeroes2(300);
        testPlayer.setHeroes3(200);
        testPlayer.setTitans(100);
        testPlayer.setDateTime(LocalDateTime.now());
        testPlayer.setActual(false);

        Player savePlayer = repository.save(testPlayer);

        Assertions.assertThat(savePlayer).isNotNull();
        Assertions.assertThat(savePlayer.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAll() {
        List<Player> players = repository.findAll();
        Assertions.assertThat(players).hasSizeGreaterThan(0);

        for (Player player : players) {
            System.out.println(player);
        }
    }

    @Test
    public void testUpdate() {
        Long playerId = 1L;
        Optional<Player> playerOptional = repository.findById(playerId);
        Player player = playerOptional.get();
        player.setNickname("TestNicknameUpdate");
        repository.save(player);

        Player updatedPlayer = repository.findById(playerId).get();
        Assertions.assertThat(updatedPlayer.getNickname()).isEqualTo("TestNicknameUpdate");
    }

    @Test
    public void testGet() {
        Long playerId = 1L;
        Optional<Player> playerOptional = repository.findById(playerId);

        Assertions.assertThat(playerOptional).isPresent();
        System.out.println(playerOptional.get());
    }

    @Test
    public void testDelete() {
        Long playerId = 1L;
        repository.deleteById(playerId);

        Optional<Player> playerOptional = repository.findById(playerId);
        Assertions.assertThat(playerOptional).isNotPresent();
    }

}
