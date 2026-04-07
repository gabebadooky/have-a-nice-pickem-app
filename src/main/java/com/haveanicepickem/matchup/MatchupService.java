package com.haveanicepickem.matchup;

import org.springframework.stereotype.Service;

import com.haveanicepickem.competitor.CompetitorDTO;
import com.haveanicepickem.competitor.CompetitorService;
import com.haveanicepickem.forecast.ForecastDTO;
import com.haveanicepickem.forecast.ForecastService;
import com.haveanicepickem.game.GameDTO;
import com.haveanicepickem.game.GameService;
import com.haveanicepickem.location.LocationDTO;
import com.haveanicepickem.location.LocationService;


@Service
public class MatchupService {

    private GameDTO game;
    private LocationDTO location;
    private ForecastDTO forecast;
    private CompetitorDTO awayCompetitor;
    private CompetitorDTO homeCompetitor;

    public MatchupService(String gameID) {
        this.game = new GameService(gameID).getGame();
        this.location = new LocationService(gameID).getLocation();
        this.forecast = new ForecastService(gameID).getForecast();
        this.awayCompetitor = new CompetitorService(gameID, game.awayTeam().id()).getCompetitor();
        this.homeCompetitor = new CompetitorService(gameID, game.homeTeam().id()).getCompetitor();
    }

    public MatchupDTO getMatchup() {
        return new MatchupDTO(
            game,
            location,
            forecast,
            awayCompetitor,
            homeCompetitor
        );
    }

}
