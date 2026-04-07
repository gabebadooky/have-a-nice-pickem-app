package com.haveanicepickem.competitor;

import java.util.List;

import com.haveanicepickem.bettingodds.BettingOddsDTO;
import com.haveanicepickem.boxscore.BoxScoreDTO;
import com.haveanicepickem.game.GameDTO;
import com.haveanicepickem.record.TeamRecordDTO;
import com.haveanicepickem.stats.StatDTO;
import com.haveanicepickem.team.TeamDTO;


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
