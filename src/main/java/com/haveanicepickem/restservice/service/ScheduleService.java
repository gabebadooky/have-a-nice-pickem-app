package com.haveanicepickem.restservice.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.GameMapper;
import com.haveanicepickem.restservice.dto.GameResponseDTO;
import com.haveanicepickem.restservice.repository.GameRepository;

@Service
public class ScheduleService {

    private GameRepository gameRepository;
    private GameMapper gameMapper;
    private String teamID;

    public ScheduleService(String teamID) {
        this.teamID = teamID;
    }

    public List<GameResponseDTO> getSchedule() {
        return gameRepository.findAllByAwayTeamOrHomeTeamOrderByWeeknum(teamID, teamID)
                                .orElse(Collections.emptyList())
                                .stream()
                                .map(gameMapper::toDTO)
                                .toList();
    }

}
