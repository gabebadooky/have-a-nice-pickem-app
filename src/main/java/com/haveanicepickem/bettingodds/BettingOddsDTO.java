package com.haveanicepickem.bettingodds;


public record BettingOddsDTO(
    String source,
    Float overUnder,
    byte moneyline,
    Float spread,
    Float winProbability
) {}
