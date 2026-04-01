package com.haveanicepickem.restservice.service;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.MatchupResponseDTO;
import com.haveanicepickem.restservice.dto.TeamResponseDTO;
import com.haveanicepickem.restservice.entity.BettingOddsEntity;
import com.haveanicepickem.restservice.entity.BettingOddsId;
import com.haveanicepickem.restservice.entity.BoxScoresEntity;
import com.haveanicepickem.restservice.entity.BoxScoresId;
import com.haveanicepickem.restservice.entity.GameEntity;
import com.haveanicepickem.restservice.entity.StatEntity;
import com.haveanicepickem.restservice.entity.StatId;
import com.haveanicepickem.restservice.entity.TeamEntity;
import com.haveanicepickem.restservice.entity.TeamRecordEntity;
import com.haveanicepickem.restservice.entity.TeamRecordId;
import com.haveanicepickem.restservice.repository.BettingOddsRepository;
import com.haveanicepickem.restservice.repository.BoxScoresRepository;
import com.haveanicepickem.restservice.repository.GameRepository;
import com.haveanicepickem.restservice.repository.StatRepository;
import com.haveanicepickem.restservice.repository.TeamRecordRepository;
import com.haveanicepickem.restservice.repository.TeamRepository;

@Service
public class MatchupService {

    private BettingOddsRepository bettingOddsRepository;
    private BoxScoresRepository boxScoresRepository;
    private GameRepository gameRepository;
    private StatRepository statRepository;
    private TeamRepository teamRepository;
    private TeamRecordRepository teamRecordRepository;


    public MatchupResponseDTO getAllBySeason(short season) {
        List<GameEntity> games = gameRepository.findBySeasonOrderByZuluGameTime(season);
        for(GameEntity game : games) {
            String gameID = game.getGameID();
            String awayTeamID = game.getAwayTeam().getTeamID();
            String homeTeamID = game.getHomeTeam().getTeamID();
            BettingOddsId bettingOddsIdentifier = new BettingOddsId(gameID, awayTeamID, "espn");
            BoxScoresId boxScoresIdentifier = new BoxScoresId(gameID, awayTeamID);
            StatId statIdentifier = new StatId(gameID, awayTeamID, "rushing_yards");
            TeamRecordId teamConferenceRecordIdentifier = new TeamRecordId(awayTeamID, "conference");
            TeamRecordId teamOverallRecordIdentifier = new TeamRecordId(awayTeamID, "overall");
            
            Optional<BettingOddsEntity> bettingOdds = bettingOddsRepository.findById(bettingOddsIdentifier);
            Optional<BoxScoresEntity> boxscores = boxScoresRepository.findById(boxScoresIdentifier);
            // Optional<List<StatEntity>> stats = statRepository.findById(statIdentifier);
            Optional<TeamEntity> team = teamRepository.findById(awayTeamID);
            Optional<TeamRecordEntity> conferenceRecord = teamRecordRepository.findById(teamConferenceRecordIdentifier);
            Optional<TeamRecordEntity> overallRecord = teamRecordRepository.findById(teamOverallRecordIdentifier);
        }
    }
    
}
