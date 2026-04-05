package com.haveanicepickem.restservice.service;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.haveanicepickem.constants.RecordType;
import com.haveanicepickem.restservice.dto.BettingOddsMapper;
import com.haveanicepickem.restservice.dto.CompetitorResponseDTO;
import com.haveanicepickem.restservice.entity.BettingOddsEntity;
import com.haveanicepickem.restservice.entity.BoxScoresEntity;
import com.haveanicepickem.restservice.entity.BoxScoresId;
import com.haveanicepickem.restservice.entity.GameEntity;
import com.haveanicepickem.restservice.entity.StatEntity;
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
public class CompetitorService {

    private BoxScoresRepository boxScoresRepository;
    private StatRepository statRepository;
    private TeamRepository teamRepository;
    private TeamRecordRepository teamRecordRepository;
    private GameRepository gameRepository;

    public CompetitorResponseDTO getCompetitor(String gameID, String teamID) {
        BoxScoresId boxscoreIdentifier = new BoxScoresId(gameID, teamID);
        TeamRecordId conferenceRecordIdentifier = new TeamRecordId(teamID, RecordType.CONFERENCE);
        TeamRecordId overallRecordIdentifier = new TeamRecordId(teamID, RecordType.OVERALL);

        
        Optional<BoxScoresEntity> boxscore = boxScoresRepository.findById(boxscoreIdentifier);
        Optional<List<StatEntity>> gameStats = statRepository.findByGameIdAndTeamId(gameID, teamID);
        Optional<List<StatEntity>> teamStats = statRepository.findByTeamId(teamID);
        Optional<TeamEntity> team = teamRepository.findById(teamID);
        Optional<TeamRecordEntity> conferenceRecord = teamRecordRepository.findById(conferenceRecordIdentifier);
        Optional<TeamRecordEntity> overallRecord = teamRecordRepository.findById(overallRecordIdentifier);
        List<GameEntity> schedule = gameRepository.findByAwayTeamOrHomeTeamOrderByWeeknum(teamID, teamID);

        return CompetitorResponseDTO(
            
            boxscore,
            gameStats,
            teamStats,
            team,
            conferenceRecord,
            overallRecord,
            schedule
        );

    }

}
