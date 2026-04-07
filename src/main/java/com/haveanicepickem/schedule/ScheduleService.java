package com.haveanicepickem.schedule;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.game.GameMapper;
import com.haveanicepickem.game.GameRepository;
import com.haveanicepickem.game.GameDTO;

@Service
public class ScheduleService {

    private GameRepository gameRepository;
    private GameMapper gameMapper;
    private String teamID;

    public ScheduleService(String teamID) {
        this.teamID = teamID;
    }

    public List<GameDTO> getSchedule() {
        return gameRepository.findAllByAwayTeamOrHomeTeamOrderByWeeknum(teamID, teamID)
                                .orElse(Collections.emptyList())
                                .stream()
                                .map(gameMapper::toDTO)
                                .toList();
    }

}
