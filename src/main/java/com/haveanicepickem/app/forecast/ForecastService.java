package com.haveanicepickem.app.forecast;

import org.springframework.stereotype.Service;

@Service
public class ForecastService {

    private final ForecastRepository gameForecastRepository;
    private final ForecastMapper gameForecastMapper;

    public ForecastService(ForecastRepository gameForecastRepository, ForecastMapper gameForecastMapper) {
        this.gameForecastRepository = gameForecastRepository;
        this.gameForecastMapper = gameForecastMapper;
    }

    public ForecastDTO getForecast(String gameID) {
        return gameForecastRepository.findById(gameID)
                                        .map(gameForecastMapper::toDTO)
                                        .orElse(null);
    }

}
