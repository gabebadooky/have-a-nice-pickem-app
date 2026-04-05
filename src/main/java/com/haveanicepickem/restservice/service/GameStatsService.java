package com.haveanicepickem.restservice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.haveanicepickem.restservice.dto.StatMapper;
import com.haveanicepickem.restservice.dto.StatsResponseDTO;
import com.haveanicepickem.restservice.entity.StatEntity;
import com.haveanicepickem.restservice.repository.StatRepository;


public class GameStatsService {

    private StatRepository statRepository;
    private StatMapper statMapper;
    private String gameID;
    private String teamID;

    public GameStatsService(String gameID, String teamID) {
        this.gameID = gameID;
        this.teamID = teamID;
    }

    private List<StatsResponseDTO> mapStats(Optional<List<StatEntity>> optionalStatsList) {
        List<StatsResponseDTO> mappedStats = new ArrayList<>();

        for (StatEntity stat : optionalStatsList.orElse(Collections.emptyList())) {
            StatsResponseDTO mappedStat = statMapper.toDTO(stat);
            mappedStats.addLast(mappedStat);
        }

        return mappedStats;
    }

    public List<StatsResponseDTO> getGameStats(String gameID, String teamID) {
        Optional<List<StatEntity>> gameStats = statRepository.findByGameIdAndTeamId(gameID, teamID);
        List<StatsResponseDTO> mappedStats = mapStats(gameStats);
        return mappedStats;
    }

    public List<StatsResponseDTO> getTeamStats(String gameID, String teamID) {
        Optional<List<StatEntity>> teamStats = statRepository.findByTeamId(teamID);
        List<StatsResponseDTO> mappedStats = mapStats(teamStats);
        return mappedStats;
    }

}
