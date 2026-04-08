package com.haveanicepickem.app.bettingodds;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

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

    public List<BettingOddsDTO> getBettingOdds() {
        return bettingOddsRepository.findAllByGameIdAndTeamId(gameID, teamID)
                                    .orElse(Collections.emptyList())
                                    .stream()
                                    .map(bettingOddsMapper::toDTO)
                                    .toList();
    }

}
