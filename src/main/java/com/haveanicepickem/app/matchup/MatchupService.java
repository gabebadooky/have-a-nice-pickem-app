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

    private final GameRepository gameRepository;
    private final GameService gameService;
    private final LocationService locationService;
    private final ForecastService forecastService;
    private final CompetitorService competitorService;

    public MatchupService(
        GameRepository gameRepository,
        GameService gameService,
        LocationService locationService,
        ForecastService forecastService,
        CompetitorService competitorService
    ) {
        this.gameRepository = gameRepository;
        this.gameService = gameService;
        this.locationService = locationService;
        this.forecastService = forecastService;
        this.competitorService = competitorService;
    }

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
        GameDTO game = gameService.getGame(gameID);
        LocationDTO location = locationService.getLocation(gameID);
        ForecastDTO forecast = forecastService.getForecast(gameID);
        CompetitorDTO awayCompetitor = competitorService.getCompetitor(gameID, game.awayTeam().id());
        CompetitorDTO homeCompetitor = competitorService.getCompetitor(gameID, game.homeTeam().id());

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
