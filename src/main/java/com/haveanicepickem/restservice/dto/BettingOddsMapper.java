package com.haveanicepickem.restservice.dto;

import org.springframework.stereotype.Component;

import com.haveanicepickem.restservice.entity.BettingOddsEntity;

@Component
public class BettingOddsMapper {
    public BettingOddResponseDTO toDTO(BettingOddsEntity bettingOdds) {
        String source = bettingOdds.getSource();
        Float overUnder = bettingOdds.getOverUnder();
        byte moneyline = bettingOdds.getMoneyline();
        Float spread = bettingOdds.getSpread();
        Float winProbability = bettingOdds.getWinProbability();

        return new BettingOddResponseDTO(
            source,
            overUnder,
            moneyline,
            spread,
            winProbability
        );
    }
}
