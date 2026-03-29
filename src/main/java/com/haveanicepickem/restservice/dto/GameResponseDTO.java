package com.haveanicepickem.restservice.dto;

import java.time.LocalDateTime;

public record GameResponseDTO(
    String league,
    short weeknum,
    short season,
    TeamResponseDTO awayTeam,
    TeamResponseDTO homeTeam,
    LocalDateTime zuluGameTime,
    String broadcast,
    LocationResponseDTO location,
    GameForecastResponseDTO forecast,
    boolean finished
) {}
