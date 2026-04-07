package com.haveanicepickem.stats.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.stats.StatDTO;
import com.haveanicepickem.stats.StatMapper;
import com.haveanicepickem.stats.StatRepository;
import com.haveanicepickem.stats.StatsService;

@Service
public class GameStatsServiceImpl implements StatsService {

    private StatRepository statRepository;
    private StatMapper statMapper;
    private String gameID;
    private String teamID;

    public GameStatsServiceImpl(String gameID, String teamID) {
        this.gameID = gameID;
        this.teamID = teamID;
    }
    
    public List<StatDTO> getStats() {
        return statRepository.findByGameIdAndTeamId(gameID, teamID)
                                .orElse(Collections.emptyList())
                                .stream()
                                .map(statMapper::toDTO)
                                .toList();
    }

}
