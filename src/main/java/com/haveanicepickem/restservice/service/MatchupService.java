package com.haveanicepickem.restservice.service;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.CompetitorResponseDTO;
import com.haveanicepickem.restservice.dto.GameForecastResponseDTO;
import com.haveanicepickem.restservice.dto.GameResponseDTO;
import com.haveanicepickem.restservice.dto.LocationResponseDTO;

@Service
public class MatchupService {

    private GameResponseDTO game;
    private LocationResponseDTO location;
    private GameForecastResponseDTO forecast;
    private CompetitorResponseDTO awayCompetitor;
    private CompetitorResponseDTO homeCompetitor;

}
