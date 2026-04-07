package com.haveanicepickem.forecast;

import org.springframework.stereotype.Service;

@Service
public class ForecastService {

    private ForecastRepository gameForecastRepository;
    private ForecastMapper gameForecastMapper;
    private String gameID;

    public ForecastService(String gameID) {
        this.gameID = gameID;
    }

    public ForecastDTO getForecast() {
        return gameForecastRepository.findById(gameID)
                                        .map(gameForecastMapper::toDTO)
                                        .orElse(null);
    }

}
