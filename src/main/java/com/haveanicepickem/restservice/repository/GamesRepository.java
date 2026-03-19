package com.haveanicepickem.restservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.GameEntity;

@Repository
public interface GamesRepository extends JpaRepository<GameEntity, String> {

    // WHERE league = ? AND season = ? AND weeknum = ? ORDER BY zulu_game_time
    List<GameEntity> findByLeagueAndSeasonAndWeeknumOrderByZuluGameTime(String league, short season, short weeknum);

    // WHERE away_team_id = ? OR home_team_id = ? ORDER BY weeknum
    List<GameEntity> findByAwayTeamOrHomeTeamOrderByWeeknum(String awayTeamID, String homeTeamID);

}
