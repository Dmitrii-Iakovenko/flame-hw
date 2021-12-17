package com.wutreg.flamehw.entity;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "players")
@EnableAutoConfiguration
public class Player {

    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    private String nickname;
    private String guild;
    private Integer heroes1;
    private Integer heroes2;
    private Integer heroes3;
    private Integer titans;
    private LocalDateTime dateTime;
    private Boolean actual;

    public Player() {
    }

    public Player(String nickname, String guild, Integer heroes1, Integer heroes2, Integer heroes3,
                  Integer titans, LocalDateTime dateTime, Boolean actual) {
        this.nickname = nickname;
        this.guild = guild;
        this.heroes1 = heroes1;
        this.heroes2 = heroes2;
        this.heroes3 = heroes3;
        this.titans = titans;
        this.dateTime = dateTime;
        this.actual = actual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public Integer getHeroes1() {
        return heroes1;
    }

    public void setHeroes1(Integer heroes1) {
        this.heroes1 = heroes1;
    }

    public Integer getHeroes2() {
        return heroes2;
    }

    public void setHeroes2(Integer heroes2) {
        this.heroes2 = heroes2;
    }

    public Integer getHeroes3() {
        return heroes3;
    }

    public void setHeroes3(Integer heroes3) {
        this.heroes3 = heroes3;
    }

    public Integer getTitans() {
        return titans;
    }

    public void setTitans(Integer titans) {
        this.titans = titans;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Boolean getActual() {
        return actual;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
////        if (!(o instanceof Player)) return false;
//        if (o == null || getClass() != o.getClass()) return false;
//        Player player = (Player) o;
//        return Objects.equals(id, player.id) && Objects.equals(nickname, player.nickname)
//                && Objects.equals(guild, player.guild) && Objects.equals(heroes1, player.heroes1)
//                && Objects.equals(heroes2, player.heroes2) && Objects.equals(heroes3, player.heroes3)
//                && Objects.equals(titans, player.titans) && Objects.equals(dateTime, player.dateTime)
//                && Objects.equals(actual, player.actual);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, nickname, guild, heroes1, heroes2, heroes3, titans, dateTime, actual);
//    }
//
//    @Override
//    public String toString() {
//        return "Player{" +
//                "id=" + id +
//                ", nickname='" + nickname + '\'' +
//                ", guild='" + guild + '\'' +
//                ", heroes1=" + heroes1 +
//                ", heroes2=" + heroes2 +
//                ", heroes3=" + heroes3 +
//                ", titans=" + titans +
//                ", dateTime=" + dateTime +
//                ", actual=" + actual +
//                '}';
//    }
}
