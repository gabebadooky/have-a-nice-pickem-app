package com.haveanicepickem.app.matchup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.app.competitor.CompetitorDTO;
import com.haveanicepickem.app.competitor.CompetitorService;
import com.haveanicepickem.app.forecast.ForecastDTO;
import com.haveanicepickem.app.forecast.ForecastService;
import com.haveanicepickem.app.game.GameDTO;
import com.haveanicepickem.app.game.GameEntity;
import com.haveanicepickem.app.game.GameRepository;
import com.haveanicepickem.app.game.GameService;
import com.haveanicepickem.app.location.LocationDTO;
import com.haveanicepickem.app.location.LocationService;


@Service
public class MatchupService {

    private GameDTO game;
    private LocationDTO location;
    private ForecastDTO forecast;
    private CompetitorDTO awayCompetitor;
    private CompetitorDTO homeCompetitor;
    private GameRepository gameRepository;

    public MatchupService() {}

    private List<String> getGameIDs() {
        List<String> gameIDs = new ArrayList<>();
        
        List<GameEntity> games = gameRepository.findAll();
        
        for (GameEntity game : games) {
            String gameID = game.getGameID();
            gameIDs.add(gameID);
        }

        return gameIDs;
    }

    private MatchupDTO getMatchup(String gameID) {
        this.game = new GameService(gameID).getGame();
        this.location = new LocationService(gameID).getLocation();
        this.forecast = new ForecastService(gameID).getForecast();
        this.awayCompetitor = new CompetitorService(gameID, game.awayTeam().id()).getCompetitor();
        this.homeCompetitor = new CompetitorService(gameID, game.homeTeam().id()).getCompetitor();

        return new MatchupDTO(
            game,
            location,
            forecast,
            awayCompetitor,
            homeCompetitor
        );
    }

    public List<MatchupDTO> getAllMatchups() {
        List<MatchupDTO> matchups = new ArrayList<>();

        List<String> gameIDs = getGameIDs();
        for (String gameID : gameIDs) {
            MatchupDTO matchup = getMatchup(gameID);
            matchups.add(matchup);
        }

        return matchups;
    }

}
