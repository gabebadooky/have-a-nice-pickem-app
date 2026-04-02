package com.haveanicepickem.restservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.CompetitorResponseDTO;
import com.haveanicepickem.restservice.entity.BettingOddsEntity;
import com.haveanicepickem.restservice.repository.BettingOddsRepository;

@Service
public class CompetitorService {

    private BettingOddsRepository bettingOddsRepository;

    public CompetitorResponseDTO getCompetitor(String gameID, String teamID) {
        Optional<List<BettingOddsEntity>> bettingOdds = bettingOddsRepository.findByGameIdAndTeamId(gameID, teamID);
    }

}
