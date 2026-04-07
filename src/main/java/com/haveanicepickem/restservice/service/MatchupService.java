package com.haveanicepickem.restservice.service;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.CompetitorResponseDTO;
import com.haveanicepickem.restservice.dto.GameForecastResponseDTO;
import com.haveanicepickem.restservice.dto.GameResponseDTO;
import com.haveanicepickem.restservice.dto.LocationResponseDTO;
import com.haveanicepickem.restservice.dto.MatchupResponseDTO;


@Service
public class MatchupService {

    private GameResponseDTO game;
    private LocationResponseDTO location;
    private GameForecastResponseDTO forecast;
    private CompetitorResponseDTO awayCompetitor;
    private CompetitorResponseDTO homeCompetitor;

    public MatchupService(String gameID) {
        this.game = new GameService(gameID).getGame();
        this.location = new LocationService(gameID).getLocation();
        this.forecast = new GameForecastService(gameID).getForecast();
        this.awayCompetitor = new CompetitorService(gameID, game.awayTeam().id()).getCompetitor();
        this.homeCompetitor = new CompetitorService(gameID, game.homeTeam().id()).getCompetitor();
    }

    public MatchupResponseDTO getMatchup() {
        MatchupResponseDTO matchup = new MatchupResponseDTO(
            game,
            location,
            forecast,
            awayCompetitor,
            homeCompetitor
        );

        return matchup;
    }

}
