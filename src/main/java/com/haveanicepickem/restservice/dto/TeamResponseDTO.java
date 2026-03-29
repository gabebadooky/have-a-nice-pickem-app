package com.haveanicepickem.restservice.dto;

import java.util.List;

public record TeamResponseDTO(
    String league,
    String espnCode,
    String cbsCode,
    String foxCode,
    String vegasCode,
    String conferenceID,
    String divisionName,
    TeamRecordResponseDTO conferenceRecord,
    TeamRecordResponseDTO overallRecord,
    String teamName,
    String teamMascot,
    boolean powerConference,
    String teamLogoURL,
    String primaryColor,
    String alternateColor,
    short ranking,
    List<BettingOddResponseDTO> bettingOdds,
    BoxScoreResponseDTO boxScore,
    List<StatsResponseDTO> gameStats,
    List<StatsResponseDTO> seasonStats
) {}
