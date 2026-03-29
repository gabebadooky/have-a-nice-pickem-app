package com.haveanicepickem.restservice.dto;

import java.time.LocalDateTime;

import com.haveanicepickem.restservice.entity.GameEntity;
import com.haveanicepickem.restservice.entity.GameForecastEntity;
import com.haveanicepickem.restservice.entity.LocationEntity;
import com.haveanicepickem.restservice.entity.TeamEntity;

public class GameMapper {
    public GameResponseDTO toDTO(GameEntity game) {
        String league = game.getLeauge();
        short weeknum = game.getWeekNum();
        short season = game.getSeason();
        TeamRecordResponseDTO awayTeam = game.getAwayTeam();
        TeamRecordResponseDTO homeTeam = game.getHomeTeam();
        LocalDateTime zuluGameTime = game.getZuluGameTime();
        String broadcast = game.getBroadcast();
        LocationResponseDTO location = game.getLocation();
        GameForecastResponseDTO forecast = new GameForecastMapper().toDTO(game.getForecast());
        boolean gameFinished = game.getGameFinished();

        return new GameResponseDTO(
            league,
            weeknum,
            season,
            // TeamMapper.toDTO(awayTeam),
            // TeamMapper.toDTO(homeTeam),
            zuluGameTime,
            broadcast,
            // LocationMapper.toDTO(location),
            forecast,
            gameFinished
        );
    }
}
