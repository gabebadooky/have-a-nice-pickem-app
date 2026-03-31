package com.haveanicepickem.restservice.dto;


public record MatchupResponseDTO(
    GameResponseDTO game,
    LocationResponseDTO location,
    GameForecastResponseDTO forecast,
    CompetitorResponseDTO away,
    CompetitorResponseDTO home
) {}
