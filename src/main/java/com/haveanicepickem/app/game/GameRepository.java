package com.haveanicepickem.app.game;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.app.team.TeamEntity;

@Repository
public interface GameRepository extends JpaRepository<GameEntity, String> {

    // WHERE league = ? AND season = ? AND weeknum = ? ORDER BY zulu_game_time
    Optional<List<GameEntity>> findAllByLeagueAndSeasonAndWeeknumOrderByZuluGameTime(String league, short season, short weeknum);

    // WHERE season = ? AND weeknum = ? ORDER BY zulu_game_time
    Optional<List<GameEntity>> findAllBySeasonAndWeeknumOrderByZuluGameTime(short season, short weeknum);

    // WHERE season = ? ORDER BY zulu_game_time
    Optional<List<GameEntity>> findAllBySeasonOrderByZuluGameTime(short season);

    // WHERE away_team_id = ? OR home_team_id = ? ORDER BY weeknum
    //Optional<List<GameEntity>> findAllByAwayTeamOrHomeTeamOrderByWeeknum(TeamEntity awayTeam, TeamEntity homeTeam);
    @Query("SELECT g FROM GameEntity g WHERE g.awayTeam = :awayTeam OR g.homeTeam = :homeTeam ORDER BY g.weeknum")
    Optional<List<GameEntity>> findAllByAwayTeamOrHomeTeamOrderByWeeknum(TeamEntity awayTeam, TeamEntity homeTeam);

}
