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

    private final StatRepository statRepository;
    private final StatMapper statMapper;

    public SeasonStatsServiceImpl(StatRepository statRepository, StatMapper statMapper) {
        this.statRepository = statRepository;
        this.statMapper = statMapper;
    }
    
    public List<StatDTO> getStats(String gameID, String teamID) {
        return statRepository.findByTeamID_Id(teamID)
                                .orElse(Collections.emptyList())
                                .stream()
                                .map(statMapper::toDTO)
                                .toList();
    }

}
