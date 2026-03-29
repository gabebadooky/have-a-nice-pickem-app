package com.haveanicepickem.restservice.dto;

import org.springframework.stereotype.Component;

import com.haveanicepickem.restservice.entity.GameForecastEntity;

@Component
public class GameForecastMapper {
    public GameForecastResponseDTO toDTO(GameForecastEntity gameForecast) {
        Float temperature = gameForecast.getTemperature();
        Float feelsLike = gameForecast.getFeelsLike();
        Float humidity = gameForecast.getHumidity();
        Float visibility = gameForecast.getVisibility();
        Float windSpeed = gameForecast.getWindSpeed();
        String shortDescription = gameForecast.getShortDescription();
        String longDescription = gameForecast.getLongDescription();

        return new GameForecastResponseDTO(
            temperature,
            feelsLike,
            humidity,
            visibility,
            windSpeed,
            shortDescription,
            longDescription
        );
    }
}
