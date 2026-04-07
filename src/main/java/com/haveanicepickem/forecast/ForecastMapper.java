package com.haveanicepickem.forecast;

import org.springframework.stereotype.Component;

@Component
public class ForecastMapper {
    public ForecastDTO toDTO(ForecastEntity gameForecast) {
        Float temperature = gameForecast.getTemperature();
        Float feelsLike = gameForecast.getFeelsLike();
        Float humidity = gameForecast.getHumidity();
        Float visibility = gameForecast.getVisibility();
        Float windSpeed = gameForecast.getWindSpeed();
        String shortDescription = gameForecast.getShortDescription();
        String longDescription = gameForecast.getLongDescription();

        return new ForecastDTO(
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
