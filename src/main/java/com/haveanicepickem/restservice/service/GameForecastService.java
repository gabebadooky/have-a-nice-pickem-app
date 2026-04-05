package com.haveanicepickem.restservice.service;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.GameForecastMapper;
import com.haveanicepickem.restservice.dto.GameForecastResponseDTO;
import com.haveanicepickem.restservice.repository.GameForecastRepository;

@Service
public class GameForecastService {

    private GameForecastRepository gameForecastRepository;
    private GameForecastMapper gameForecastMapper;
    private String gameID;

    public GameForecastService(String gameID) {
        this.gameID = gameID;
    }

    public GameForecastResponseDTO getForecast() {
        return gameForecastRepository.findById(gameID)
                                        .map(gameForecastMapper::toDTO)
                                        .orElse(null);
    }

}
