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
        Optional<List<BettingOddsEntity>> optionalBettingOddsList = bettingOddsRepository.findByGameIdAndTeamId(gameID, teamID);
        List<BettingOddResponseDTO> mappedBettingOddsList = new ArrayList<>();

        for (BettingOddsEntity bettingOdds : optionalBettingOddsList.orElse(Collections.emptyList())) {
            BettingOddResponseDTO mappedBettingOdds = bettingOddsMapper.toDTO(bettingOdds);
            mappedBettingOddsList.addLast(mappedBettingOdds);
        };

        return mappedBettingOddsList;
    }

}
