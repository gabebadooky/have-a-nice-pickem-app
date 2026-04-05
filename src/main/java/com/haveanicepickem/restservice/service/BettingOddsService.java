package com.haveanicepickem.restservice.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.BettingOddResponseDTO;
import com.haveanicepickem.restservice.dto.BettingOddsMapper;
import com.haveanicepickem.restservice.repository.BettingOddsRepository;

@Service
public class BettingOddsService {

    private BettingOddsMapper bettingOddsMapper;
    private BettingOddsRepository bettingOddsRepository;
    private String gameID;
    private String teamID;

    public BettingOddsService(String gameID, String teamID) {
        this.gameID = gameID;
        this.teamID = teamID;
    }

    public List<BettingOddResponseDTO> getBettingOdds() {
        return bettingOddsRepository.findByGameIdAndTeamId(gameID, teamID)
                                    .orElse(Collections.emptyList())
                                    .stream()
                                    .map(bettingOddsMapper::toDTO)
                                    .toList();
    }

}
