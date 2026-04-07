package com.haveanicepickem.competitor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.bettingodds.BettingOddsDTO;
import com.haveanicepickem.bettingodds.BettingOddsService;
import com.haveanicepickem.boxscore.BoxScoreDTO;
import com.haveanicepickem.boxscore.BoxScoreService;
import com.haveanicepickem.constants.RecordType;
import com.haveanicepickem.game.GameDTO;
import com.haveanicepickem.record.TeamRecordDTO;
import com.haveanicepickem.record.impl.ConferenceRecordImpl;
import com.haveanicepickem.schedule.ScheduleService;
import com.haveanicepickem.stats.StatDTO;
import com.haveanicepickem.stats.impl.GameStatsServiceImpl;
import com.haveanicepickem.stats.impl.SeasonStatsServiceImpl;
import com.haveanicepickem.team.TeamDTO;
import com.haveanicepickem.team.TeamService;

@Service
public class CompetitorService {

    private List<BettingOddsDTO> bettingOdds;
    private BoxScoreDTO boxscore;
    private List<StatDTO> gameStats;
    private List<StatDTO> seasonStats;
    private TeamDTO team;
    private TeamRecordDTO conferenceRecord;
    private TeamRecordDTO overallRecord;
    private List<GameDTO> schedule;

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

    public CompetitorDTO getCompetitor() {
        CompetitorDTO competitor = new CompetitorDTO(
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
