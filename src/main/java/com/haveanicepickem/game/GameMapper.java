package com.haveanicepickem.game;

import java.time.LocalDateTime;

import com.haveanicepickem.forecast.ForecastMapper;
import com.haveanicepickem.location.LocationMapper;
import com.haveanicepickem.location.LocationDTO;
import com.haveanicepickem.forecast.ForecastDTO;
import com.haveanicepickem.team.TeamMapper;
import com.haveanicepickem.team.TeamDTO;

public class GameMapper {

    public GameDTO toDTO(GameEntity game) {
        String league = game.getLeague();
        short weeknum = game.getWeekNum();
        short season = game.getSeason();
        TeamDTO awayTeam = new TeamMapper().toDTO(game.getAwayTeam());
        TeamDTO homeTeam = new TeamMapper().toDTO(game.getHomeTeam());
        LocalDateTime zuluGameTime = game.getZuluGameTime();
        String broadcast = game.getBroadcast();
        LocationDTO location = new LocationMapper().toDTO(game.getLocation());
        ForecastDTO forecast = new ForecastMapper().toDTO(game.getForecast());
        boolean gameFinished = game.getGameFinished();

        return new GameDTO(
            league,
            weeknum,
            season,
            awayTeam,
            homeTeam,
            zuluGameTime,
            broadcast,
            location,
            forecast,
            gameFinished
        );
    }

}
