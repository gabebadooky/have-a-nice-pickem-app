package com.haveanicepickem.app.game;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.haveanicepickem.app.forecast.ForecastMapper;
import com.haveanicepickem.app.location.LocationMapper;
import com.haveanicepickem.app.location.LocationDTO;
import com.haveanicepickem.app.forecast.ForecastDTO;
import com.haveanicepickem.app.team.TeamMapper;
import com.haveanicepickem.app.team.TeamDTO;

@Component
public class GameMapper {

    private final ForecastMapper forecastMapper;
    private final LocationMapper locationMapper;
    private final TeamMapper teamMapper;

    public GameMapper(ForecastMapper forecastMapper, LocationMapper locationMapper, TeamMapper teamMapper) {
        this.forecastMapper = forecastMapper;
        this.locationMapper = locationMapper;
        this.teamMapper = teamMapper;
    }

    public GameDTO toDTO(GameEntity game) {
        String league = game.getLeague();
        short weeknum = game.getWeekNum();
        short season = game.getSeason();
        TeamDTO awayTeam = teamMapper.toDTO(game.getAwayTeam());
        TeamDTO homeTeam = teamMapper.toDTO(game.getHomeTeam());
        LocalDateTime zuluGameTime = game.getZuluGameTime();
        String broadcast = game.getBroadcast();
        LocationDTO location = locationMapper.toDTO(game.getLocation());
        ForecastDTO forecast = forecastMapper.toDTO(game.getForecast());
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
