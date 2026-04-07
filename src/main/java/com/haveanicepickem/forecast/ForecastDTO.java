package com.haveanicepickem.forecast;


public record ForecastDTO(
    Float temperature,
    Float feelsLike,
    Float humidity,
    Float visibility,
    Float windSpeed,
    String shortDescription,
    String longDescription
) {}
