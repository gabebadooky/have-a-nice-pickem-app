package com.haveanicepickem.restservice.service;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.haveanicepickem.constants.RecordType;
import com.haveanicepickem.restservice.dto.BettingOddResponseDTO;
import com.haveanicepickem.restservice.dto.BoxScoreResponseDTO;
import com.haveanicepickem.restservice.dto.CompetitorResponseDTO;
import com.haveanicepickem.restservice.dto.StatsResponseDTO;
import com.haveanicepickem.restservice.dto.TeamResponseDTO;
import com.haveanicepickem.restservice.entity.GameEntity;
import com.haveanicepickem.restservice.entity.StatEntity;
import com.haveanicepickem.restservice.entity.TeamEntity;
import com.haveanicepickem.restservice.entity.TeamRecordEntity;
import com.haveanicepickem.restservice.entity.TeamRecordId;
import com.haveanicepickem.restservice.repository.GameRepository;
import com.haveanicepickem.restservice.repository.StatRepository;
import com.haveanicepickem.restservice.repository.TeamRecordRepository;
import com.haveanicepickem.restservice.repository.TeamRepository;

@Service
public class CompetitorService {

    private StatsService statService;
    
    private TeamRepository teamRepository;
    private TeamRecordRepository teamRecordRepository;
    private GameRepository gameRepository;

    public CompetitorResponseDTO getCompetitor(String gameID, String teamID) {
        List<BettingOddResponseDTO> bettingOdds = new BettingOddsService(gameID, teamID).getBettingOdds();
        BoxScoreResponseDTO boxscore = new BoxScoreService(gameID, teamID).getBoxscores();
        List<StatsResponseDTO> gameStats = new GameStatsServiceImpl(gameID, teamID).getStats();
        List<StatsResponseDTO> seasonStats = new SeasonStatsServiceImpl(teamID).getStats();
        TeamResponseDTO team = new TeamService(teamID).getTeam();

        
        TeamRecordId conferenceRecordIdentifier = new TeamRecordId(teamID, RecordType.CONFERENCE);
        TeamRecordId overallRecordIdentifier = new TeamRecordId(teamID, RecordType.OVERALL);

        
        Optional<TeamEntity> team = teamRepository.findById(teamID);
        Optional<TeamRecordEntity> conferenceRecord = teamRecordRepository.findById(conferenceRecordIdentifier);
        Optional<TeamRecordEntity> overallRecord = teamRecordRepository.findById(overallRecordIdentifier);
        List<GameEntity> schedule = gameRepository.findByAwayTeamOrHomeTeamOrderByWeeknum(teamID, teamID);


        return CompetitorResponseDTO(
            bettingOdds,
            boxscore,
            gameStats,
            seasonStats


            team,
            conferenceRecord,
            overallRecord,
            schedule
        );

    }

}
