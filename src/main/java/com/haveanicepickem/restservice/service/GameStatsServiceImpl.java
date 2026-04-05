package com.haveanicepickem.restservice.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.StatMapper;
import com.haveanicepickem.restservice.dto.StatsResponseDTO;
import com.haveanicepickem.restservice.repository.StatRepository;

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
    
    public List<StatsResponseDTO> getStats() {
        return statRepository.findByGameIdAndTeamId(gameID, teamID)
                                .orElse(Collections.emptyList())
                                .stream()
                                .map(statMapper::toDTO)
                                .toList();
    }

}
