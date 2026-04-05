package com.haveanicepickem.restservice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.haveanicepickem.restservice.dto.BettingOddResponseDTO;
import com.haveanicepickem.restservice.dto.BettingOddsMapper;
import com.haveanicepickem.restservice.entity.BettingOddsEntity;
import com.haveanicepickem.restservice.repository.BettingOddsRepository;

public class BettingOddsService {

    private BettingOddsMapper bettingOddsMapper;
    private BettingOddsRepository bettingOddsRepository;

    public List<BettingOddResponseDTO> getBettingOdds(String gameID, String teamID) {
        Optional<List<BettingOddsEntity>> bettingOddsOptionalList = bettingOddsRepository.findByGameIdAndTeamId(gameID, teamID);
        
        List<BettingOddResponseDTO> mappedBettingOdds = new ArrayList<>();

        for (BettingOddsEntity bettingOdds : bettingOddsOptionalList.orElse(Collections.emptyList())) {
            BettingOddResponseDTO bettingOddResponse = bettingOddsMapper.toDTO(bettingOdds);
            mappedBettingOdds.addLast(bettingOddResponse);
        };

        return mappedBettingOdds;
    }

}
