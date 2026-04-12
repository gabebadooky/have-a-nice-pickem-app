package com.haveanicepickem.app.bettingodds;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BettingOddsService {

    private final BettingOddsMapper bettingOddsMapper;
    private final BettingOddsRepository bettingOddsRepository;

    public BettingOddsService(BettingOddsRepository bettingOddsRepository, BettingOddsMapper bettingOddsMapper) {
        this.bettingOddsRepository = bettingOddsRepository;
        this.bettingOddsMapper = bettingOddsMapper;
    }

    public List<BettingOddsDTO> getBettingOdds(String gameID, String teamID) {
        return bettingOddsRepository.findAllByGameID_IdAndTeamID_Id(gameID, teamID)
                                    .orElse(Collections.emptyList())
                                    .stream()
                                    .map(bettingOddsMapper::toDTO)
                                    .toList();
    }

}
