package com.haveanicepickem.app.competitor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.app.bettingodds.BettingOddsDTO;
import com.haveanicepickem.app.bettingodds.BettingOddsService;
import com.haveanicepickem.app.boxscore.BoxScoreDTO;
import com.haveanicepickem.app.boxscore.BoxScoreService;
import com.haveanicepickem.app.constants.RecordType;
import com.haveanicepickem.app.game.GameDTO;
import com.haveanicepickem.app.record.TeamRecordDTO;
import com.haveanicepickem.app.record.impl.ConferenceRecordImpl;
import com.haveanicepickem.app.schedule.ScheduleService;
import com.haveanicepickem.app.stats.StatDTO;
import com.haveanicepickem.app.stats.impl.GameStatsServiceImpl;
import com.haveanicepickem.app.stats.impl.SeasonStatsServiceImpl;
import com.haveanicepickem.app.team.TeamDTO;
import com.haveanicepickem.app.team.TeamService;

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
