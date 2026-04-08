package com.haveanicepickem.app.game;

import java.time.LocalDateTime;

import com.haveanicepickem.app.forecast.ForecastMapper;
import com.haveanicepickem.app.location.LocationMapper;
import com.haveanicepickem.app.location.LocationDTO;
import com.haveanicepickem.app.forecast.ForecastDTO;
import com.haveanicepickem.app.team.TeamMapper;
import com.haveanicepickem.app.team.TeamDTO;

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
