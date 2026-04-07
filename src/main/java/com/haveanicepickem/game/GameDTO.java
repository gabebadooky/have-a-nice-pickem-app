package com.haveanicepickem.game;

import java.time.LocalDateTime;

import com.haveanicepickem.forecast.ForecastDTO;
import com.haveanicepickem.location.LocationDTO;
import com.haveanicepickem.team.TeamDTO;

public record GameDTO(
    String league,
    short weeknum,
    short season,
    TeamDTO awayTeam,
    TeamDTO homeTeam,
    LocalDateTime zuluGameTime,
    String broadcast,
    LocationDTO location,
    ForecastDTO forecast,
    boolean finished
) {}
