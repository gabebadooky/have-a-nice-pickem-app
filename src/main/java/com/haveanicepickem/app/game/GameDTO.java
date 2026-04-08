package com.haveanicepickem.app.game;

import java.time.LocalDateTime;

import com.haveanicepickem.app.forecast.ForecastDTO;
import com.haveanicepickem.app.location.LocationDTO;
import com.haveanicepickem.app.team.TeamDTO;

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
