package com.haveanicepickem.app.schedule;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.app.game.GameMapper;
import com.haveanicepickem.app.game.GameRepository;
import com.haveanicepickem.app.game.GameDTO;

@Service
public class ScheduleService {

    private final GameRepository gameRepository;
    private final GameMapper gameMapper;

    public ScheduleService(GameRepository gameRepository, GameMapper gameMapper) {
        this.gameRepository = gameRepository;
        this.gameMapper = gameMapper;
    }

    public List<GameDTO> getSchedule(String teamID) {
        return gameRepository.findAllByAwayTeamOrHomeTeamOrderByWeeknum(teamID, teamID)
                                .orElse(Collections.emptyList())
                                .stream()
                                .map(gameMapper::toDTO)
                                .toList();
    }

}
