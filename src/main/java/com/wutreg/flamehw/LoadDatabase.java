package com.wutreg.flamehw;

import com.wutreg.flamehw.entity.Player;
import com.wutreg.flamehw.repository.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PlayerRepository repository) {
        log.info("************************************");
        return args -> {
            // TODO: не создаёт таблицу в базе данных
//            log.info("Preloading " + repository.save(new Player("Дружище Христос", "White Wolfs", 400, 0, 0, 300, LocalDateTime.now(), true)));
//            log.info("Preloading " + repository.save(new Player("Анна", "White Wolfs", 300, 0, 0, 300, LocalDateTime.now(), true)));
        };
    }

}
