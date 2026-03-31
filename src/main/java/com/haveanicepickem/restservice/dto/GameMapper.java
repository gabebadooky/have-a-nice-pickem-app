package com.haveanicepickem.restservice.dto;

import java.time.LocalDateTime;

import com.haveanicepickem.restservice.entity.GameEntity;

public class GameMapper {
    public GameResponseDTO toDTO(GameEntity game) {
        String league = game.getLeauge();
        short weeknum = game.getWeekNum();
        short season = game.getSeason();
        TeamResponseDTO awayTeam = new TeamMapper().toDTO(game.getAwayTeam());
        TeamResponseDTO homeTeam = new TeamMapper().toDTO(game.getHomeTeam());
        LocalDateTime zuluGameTime = game.getZuluGameTime();
        String broadcast = game.getBroadcast();
        LocationResponseDTO location = new LocationMapper().toDTO(game.getLocation());
        GameForecastResponseDTO forecast = new GameForecastMapper().toDTO(game.getForecast());
        boolean gameFinished = game.getGameFinished();

        return new GameResponseDTO(
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
