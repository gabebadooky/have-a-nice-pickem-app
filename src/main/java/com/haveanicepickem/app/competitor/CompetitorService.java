package com.haveanicepickem.app.competitor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.app.bettingodds.BettingOddsDTO;
import com.haveanicepickem.app.bettingodds.BettingOddsService;
import com.haveanicepickem.app.boxscore.BoxScoreDTO;
import com.haveanicepickem.app.boxscore.BoxScoreService;
import com.haveanicepickem.app.game.GameDTO;
import com.haveanicepickem.app.record.TeamRecordDTO;
import com.haveanicepickem.app.record.impl.ConferenceRecordImpl;
import com.haveanicepickem.app.record.impl.OverallRecordImpl;
import com.haveanicepickem.app.schedule.ScheduleService;
import com.haveanicepickem.app.shared.constants.RecordType;
import com.haveanicepickem.app.stats.StatDTO;
import com.haveanicepickem.app.stats.impl.GameStatsServiceImpl;
import com.haveanicepickem.app.stats.impl.SeasonStatsServiceImpl;
import com.haveanicepickem.app.team.TeamDTO;
import com.haveanicepickem.app.team.TeamRepository;
import com.haveanicepickem.app.team.TeamService;

@Service
public class CompetitorService {

    private final BettingOddsService bettingOddsService;
    private final BoxScoreService boxScoreService;
    private final GameStatsServiceImpl gameStatsService;
    private final SeasonStatsServiceImpl seasonStatsService;
    private final TeamService teamService;
    private final ConferenceRecordImpl conferenceRecordImpl;
    private final OverallRecordImpl overallRecordImpl;
    private final ScheduleService scheduleService;
    private final TeamRepository teamRepository;

    public CompetitorService(
        BettingOddsService bettingOddsService,
        BoxScoreService boxScoreService,
        GameStatsServiceImpl gameStatsService,
        SeasonStatsServiceImpl seasonStatsService,
        TeamService teamService,
        ConferenceRecordImpl conferenceRecordImpl,
        OverallRecordImpl overallRecordImpl,
        ScheduleService scheduleService,
        TeamRepository teamRepository
    ) {
        this.bettingOddsService = bettingOddsService;
        this.boxScoreService = boxScoreService;
        this.gameStatsService = gameStatsService;
        this.seasonStatsService = seasonStatsService;
        this.teamService = teamService;
        this.conferenceRecordImpl = conferenceRecordImpl;
        this.overallRecordImpl = overallRecordImpl;
        this.scheduleService = scheduleService;
        this.teamRepository = teamRepository;
    }

    public CompetitorDTO getCompetitor(String gameID, String teamID) {
        List<BettingOddsDTO> bettingOdds = bettingOddsService.getBettingOdds(gameID, teamID);
        BoxScoreDTO boxscore = boxScoreService.getBoxscores(gameID, teamID);
        List<StatDTO> gameStats = gameStatsService.getStats(gameID, teamID);
        List<StatDTO> seasonStats = seasonStatsService.getStats(null, teamID);
        TeamDTO team = teamService.getTeam(teamID);
        TeamRecordDTO conferenceRecord = conferenceRecordImpl.getRecord(teamID, RecordType.CONFERENCE);
        TeamRecordDTO overallRecord = overallRecordImpl.getRecord(teamID, RecordType.OVERALL);
        List<GameDTO> schedule = scheduleService.getSchedule(teamRepository.findById(teamID));

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
