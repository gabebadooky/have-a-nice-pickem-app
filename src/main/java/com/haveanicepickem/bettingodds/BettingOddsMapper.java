package com.haveanicepickem.bettingodds;

import org.springframework.stereotype.Component;

@Component
public class BettingOddsMapper {
    public BettingOddsDTO toDTO(BettingOddsEntity bettingOdds) {
        String source = bettingOdds.getSource();
        Float overUnder = bettingOdds.getOverUnder();
        byte moneyline = bettingOdds.getMoneyline();
        Float spread = bettingOdds.getSpread();
        Float winProbability = bettingOdds.getWinProbability();

        return new BettingOddsDTO(
            source,
            overUnder,
            moneyline,
            spread,
            winProbability
        );
    }
}
