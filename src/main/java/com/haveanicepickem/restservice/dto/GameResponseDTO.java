package com.haveanicepickem.restservice.dto;

import java.time.LocalDateTime;

public record GameResponseDTO(
    String league,
    short weeknum,
    short season,
    String espnCode,
    String cbsCode,
    String foxCode,
    String vegasCode,
    TeamResponseDTO awayTeam,
    TeamResponseDTO homeTeam,
    LocalDateTime zuluGameTime,
    String broadcast,
    LocationResponseDTO location,
    GameForecastResponseDTO forecast,
    boolean finished
) {}
