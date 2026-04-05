package com.haveanicepickem.restservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.constants.RecordType;
import com.haveanicepickem.restservice.dto.BettingOddResponseDTO;
import com.haveanicepickem.restservice.dto.BoxScoreResponseDTO;
import com.haveanicepickem.restservice.dto.CompetitorResponseDTO;
import com.haveanicepickem.restservice.dto.GameResponseDTO;
import com.haveanicepickem.restservice.dto.StatsResponseDTO;
import com.haveanicepickem.restservice.dto.TeamRecordResponseDTO;
import com.haveanicepickem.restservice.dto.TeamResponseDTO;

@Service
public class CompetitorService {

    private List<BettingOddResponseDTO> bettingOdds;
    private BoxScoreResponseDTO boxscore;
    private List<StatsResponseDTO> gameStats;
    private List<StatsResponseDTO> seasonStats;
    private TeamResponseDTO team;
    private TeamRecordResponseDTO conferenceRecord;
    private TeamRecordResponseDTO overallRecord;
    private List<GameResponseDTO> schedule;

    public CompetitorService(String gameID, String teamID) {
        this.bettingOdds = new BettingOddsService(gameID, teamID).getBettingOdds();
        this.boxscore = new BoxScoreService(gameID, teamID).getBoxscores();
        this.gameStats = new GameStatsServiceImpl(gameID, teamID).getStats();
        this.seasonStats = new SeasonStatsServiceImpl(teamID).getStats();
        this.team = new TeamService(teamID).getTeam();
        this.conferenceRecord = new ConferenceRecordImpl(teamID, RecordType.CONFERENCE).getRecord();
        this.overallRecord = new ConferenceRecordImpl(teamID, RecordType.OVERALL).getRecord();
        this.schedule = new ScheduleService(teamID).getSchedule();
    }

    public CompetitorResponseDTO getCompetitor(String gameID, String teamID) {
        CompetitorResponseDTO competitor = new CompetitorResponseDTO(
            bettingOdds,
            boxscore,
            gameStats,
            seasonStats,
            team,
            conferenceRecord,
            overallRecord,
            schedule
        );

        return competitor;
    }

}
