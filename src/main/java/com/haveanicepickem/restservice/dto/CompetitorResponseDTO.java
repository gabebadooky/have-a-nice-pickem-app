package com.haveanicepickem.restservice.dto;

import java.util.List;

public record CompetitorResponseDTO(
    List<BettingOddResponseDTO> bettingOdds,
    BoxScoreResponseDTO boxscore,
    List<StatsResponseDTO> gameStats,
    List<StatsResponseDTO> seasonStats,
    TeamResponseDTO team,
    TeamRecordResponseDTO conferenceRecord,
    TeamRecordResponseDTO overallRecord
) {}
