package com.haveanicepickem.app.competitor;

import java.util.List;

import com.haveanicepickem.app.bettingodds.BettingOddsDTO;
import com.haveanicepickem.app.boxscore.BoxScoreDTO;
import com.haveanicepickem.app.game.GameDTO;
import com.haveanicepickem.app.record.TeamRecordDTO;
import com.haveanicepickem.app.stats.StatDTO;
import com.haveanicepickem.app.team.TeamDTO;


public record CompetitorDTO(
    List<BettingOddsDTO> bettingOdds,
    BoxScoreDTO boxscore,
    List<StatDTO> gameStats,
    List<StatDTO> seasonStats,
    TeamDTO team,
    TeamRecordDTO conferenceRecord,
    TeamRecordDTO overallRecord,
    List<GameDTO> schedule
) {}
