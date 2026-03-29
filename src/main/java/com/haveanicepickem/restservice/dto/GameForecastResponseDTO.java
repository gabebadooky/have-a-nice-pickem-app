package com.haveanicepickem.restservice.dto;


public record GameForecastResponseDTO(
    Float temperature,
    Float feelsLike,
    Float humidity,
    Float visibility,
    Float windSpeed,
    String shortDescription,
    String longDescription
) {}
