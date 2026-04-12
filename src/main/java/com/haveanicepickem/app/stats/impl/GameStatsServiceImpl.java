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

    private final StatRepository statRepository;
    private final StatMapper statMapper;

    public GameStatsServiceImpl(StatRepository statRepository, StatMapper statMapper) {
        this.statRepository = statRepository;
        this.statMapper = statMapper;
    }
    
    public List<StatDTO> getStats(String gameID, String teamID) {
        return statRepository.findByGameID_IdAndTeamID_Id(gameID, teamID)
                                .orElse(Collections.emptyList())
                                .stream()
                                .map(statMapper::toDTO)
                                .toList();
    }

}
