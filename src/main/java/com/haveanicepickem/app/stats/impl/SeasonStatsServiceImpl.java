package com.haveanicepickem.app.stats.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.app.stats.StatDTO;
import com.haveanicepickem.app.stats.StatMapper;
import com.haveanicepickem.app.stats.StatRepository;
import com.haveanicepickem.app.stats.StatsService;

@Service
public class SeasonStatsServiceImpl implements StatsService {

    private StatRepository statRepository;
    private StatMapper statMapper;
    private String teamID;

    public SeasonStatsServiceImpl(String teamID) {
        this.teamID = teamID;
    }
    
    public List<StatDTO> getStats() {
        return statRepository.findByTeamId(teamID)
                                .orElse(Collections.emptyList())
                                .stream()
                                .map(statMapper::toDTO)
                                .toList();
    }

}
