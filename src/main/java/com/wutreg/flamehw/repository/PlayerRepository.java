package com.wutreg.flamehw.repository;

import com.wutreg.flamehw.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
