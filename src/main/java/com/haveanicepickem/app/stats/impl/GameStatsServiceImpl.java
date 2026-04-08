package com.haveanicepickem.app.stats.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.app.stats.StatDTO;
import com.haveanicepickem.app.stats.StatMapper;
import com.haveanicepickem.app.stats.StatRepository;
import com.haveanicepickem.app.stats.StatsService;

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
